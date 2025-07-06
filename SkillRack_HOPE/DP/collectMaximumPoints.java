package DP;
import java.util.*;
public class collectMaximumPoints {

    public static void main(String[] args) {
		try (//Your Code Here
		Scanner sc = new Scanner(System.in)) {
			int R= sc.nextInt();
			int C= sc.nextInt();
			int[][] mat=new int[R][C];
			for(int i=0;i<R;i++){
			    for(int j=0;j<C;j++){
			        mat[i][j]=sc.nextInt();
			    }
			}
			
			for(int col=1;col<C;col++)mat[0][col]+=mat[0][col-1];
			for(int row=1;row<R;row++)mat[row][0]+=mat[row-1][0];
			
			for(int row=1;row<R;row++){
			    for(int col=1;col<C;col++){
			        mat[row][col]+=Math.max(mat[row-1][col],mat[row][col-1]);
			    }
			}
			
			System.out.print(mat[R-1][C-1]);
		}

	}
}
// This code reads the dimensions of a matrix and its elements, then calculates the maximum points that can be collected from the top-left to the bottom-right corner of the matrix.
// The output is the maximum points that can be collected by moving only right or down in the matrix.
// The question is to find the maximum points that can be collected in a grid by moving from the top-left to the bottom-right corner, where each cell contains points.