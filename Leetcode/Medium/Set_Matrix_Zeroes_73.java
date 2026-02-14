package Leetcode.Medium;
public class Set_Matrix_Zeroes_73 {
    public void setZeroes(int[][] matrix) {
        boolean r=false,c=false;
        int R=matrix.length,C=matrix[0].length;
        for(int i=0;i<R;i++){
            if(matrix[i][0]==0){
                r=true;
                break;
            }
        }
        for(int i=0;i<C;i++){
            if(matrix[0][i]==0){
                c=true;
                break;
            }
        }
        for(int row=1;row<R;row++){
            for(int col=1;col<C;col++){
                if(matrix[row][col]==0){
                    matrix[0][col]=0;
                    matrix[row][0]=0;
                }
            }
        }
        for(int i=1;i<R;i++){
            if(matrix[i][0]==0){
                for(int j=1;j<C;j++){
                    matrix[i][j]=0;
                }
            }
        }
        for(int i=1;i<C;i++){
            if(matrix[0][i]==0){
                for(int j=1;j<R;j++){
                    matrix[j][i]=0;
                }
            }
        }
        if(r){
            for(int i=0;i<R;i++){
                matrix[i][0]=0;
            }
        }
        if(c){
            for(int i=0;i<C;i++){
                matrix[0][i]=0;
            }
        }
    }
}