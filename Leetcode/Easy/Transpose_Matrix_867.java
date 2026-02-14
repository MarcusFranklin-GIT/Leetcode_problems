package Leetcode.Easy;
public class Transpose_Matrix_867 {
    public int[][] transpose(int[][] matrix) {
       int [][] mat=new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                mat[j][i]=matrix[i][j];
            }
        }
        return mat;
    }
}