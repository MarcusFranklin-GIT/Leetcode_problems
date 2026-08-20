import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Number_of_distinct_islands_694 {
    
    int diff[][] = {{1,0},{0,1},{-1,0},{0,-1}};
    public int countDistinctIslands(int[][] grid) {
        int R = grid.length;
        int C = grid[0].length;

        boolean visited[][] = new boolean[R][C];

        Set<String> result = new HashSet<>();

        for(int row=0 ; row < R ;row++){
            for(int col = 0 ; col < C ; col++){
                if(grid[row][col]==1 && !visited[row][col]){
                    result.add(BFS(R,C,row,col,grid,visited));
                }
            }
        }
        return result.size(); 
    }

    public String BFS(int R,int C,int row,int col,int[][]grid,boolean[][] visited){

        
        Queue<int[]> Q = new LinkedList<>();
        Q.add(new int[]{row,col});

        visited[row][col]=true;

        StringBuilder res = new StringBuilder();

        while(!Q.isEmpty()){
            int[] curr = Q.poll();

            res.append((curr[0]-row)).append(",").append(curr[1]-col).append(" ");

            for(int dir[]:diff){
                int currR = curr[0]+dir[0];
                int currC = curr[1]+dir[1];

                if(currR>=0 && currR<R && currC>=0 && currC<C && grid[currR][currC]==1 && !visited[currR][currC]){
                    Q.add(new int[]{currR,currC});
                    visited[currR][currC] = true;
                }
            }
        }
        return res.toString();
    }
}