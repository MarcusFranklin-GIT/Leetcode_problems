package Leetcode.Medium.BFS;

import java.util.LinkedList;
import java.util.Queue;

public class Rotting_Oranges_994 {
    
    int diff[][] = {{0,1},{1,0},{-1,0},{0,-1}};
    public int orangesRotting(int[][] grid) {
        int R = grid.length;
        int C = grid[0].length;

        Queue<int[]> Q = new LinkedList<>();

        int oranges = 0;

        for(int row = 0 ; row < R ; row++){
            for(int col=0 ; col<C ; col++){
                if(grid[row][col]==2){
                    Q.add(new int[]{row,col});
                }else if(grid[row][col]==1){
                    oranges++;
                }
            }
        }

        if(Q.isEmpty() && oranges==0)return 0;

        int time =0;
        while(!Q.isEmpty()){
            int size = Q.size();
            
            while(size-->0){
                int[]curr = Q.poll();
                int r = curr[0];
                int c = curr[1];

                for(int dir[] : diff){
                    int adjR = r + dir[0];
                    int adjC = c + dir[1];

                    if(adjR<R && adjR>=0 && adjC<C && adjC>=0 && grid[adjR][adjC]==1){
                        Q.add(new int[]{adjR,adjC});
                        grid[adjR][adjC]=2;
                        oranges--;
                    }
                }
            } 
            time++;
        }
        return (oranges==0) ? time-1 : -1 ;
    }
}
