package Leetcode.Medium.BFS;

import java.util.LinkedList;
import java.util.Queue;

public class Surrounded_Regions_130 {
    int diff[][] = {{0,1},{1,0},{-1,0},{0,-1}};
    
    public char[][] fill(char[][] mat) {
        int R = mat.length;
        int C = mat[0].length;

        for(int i=0;i<R;i++){
            if(mat[i][0]=='O')BFS(R,C,i,0,mat);
            if(mat[i][C-1]=='O')BFS(R,C,i,C-1,mat);
        }
        for(int i=0;i<C;i++){
            if(mat[0][i]=='O')BFS(R,C,0,i,mat);
            if(mat[R-1][i]=='O')BFS(R,C,R-1,i,mat);
        }

        for(int row=0;row<R;row++){
            for(int col=0;col<C;col++){
                if(mat[row][col]=='O'){
                    mat[row][col]='X';
                }else if(mat[row][col]=='Y'){
                    mat[row][col]='O';
                }
            }
        }
        return mat;
    }
    public void BFS(int R,int C,int row,int col,char[][] mat){
        
        Queue<int[]> Q = new LinkedList<>();
        Q.add(new int[]{row,col});
        mat[row][col] = 'Y';

        while(!Q.isEmpty()){
            int curr[] = Q.poll();

            int r = curr[0];
            int c = curr[1];


            for(int dir[] : diff){
                int adjR = r + dir[0];
                int adjC = c + dir[1];

                if(adjC>=0 && adjC<C && adjR<R && adjR>=0 && mat[adjR][adjC]=='O'){
                    mat[adjR][adjC] = 'Y';
                    Q.add(new int[]{adjR,adjC});
                }
            }
        }
    }
}
