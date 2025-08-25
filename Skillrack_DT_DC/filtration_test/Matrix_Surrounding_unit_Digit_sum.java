package filtration_test;


import java.util.*;
public class Matrix_Surrounding_unit_Digit_sum {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int R=sc.nextInt();
		int C=sc.nextInt();
		int arr[][]=new int[R][C];
		for(int i=0;i<R;i++){
		    for(int j=0;j<C;j++){
		        arr[i][j]=sc.nextInt();
		    }
		}
		for(int row=0;row<R;row++){
		    for(int col=0;col<C;col++){
		        int sum=arr[row][col]+surround(R,C,row,col,arr);
		        System.out.print(sum+" ");
		    }
		    System.out.println(".");
		}
	}
	static int diff[][]={{1,0},{0,1},{-1,0},{0,-1},{1,1},{1,-1},{-1,1},{-1,-1}};
	public static int surround(int R,int C,int row,int col,int [][]arr){
	    int ans=0;
	    for(int dir[]:diff){
	        int adjR=row+dir[0];
	        int adjC=col+dir[1];
	        if(adjR<R && adjC<C && adjR>=0 && adjC>=0){
	            ans+=Math.abs(arr[adjR][adjC]%10);
	        }
	    }
	    return ans;
	}
}