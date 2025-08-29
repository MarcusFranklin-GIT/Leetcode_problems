package filtration_test;

import java.util.*;
public class Gold_find {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int R=sc.nextInt();
		int C=sc.nextInt();
		char [][] arr=new char[R][C];
		int Arow=0,Acol=0,Brow=0,Bcol=0;
		for(int i=0;i<R;i++){
		    for(int j=0;j<C;j++){
		        arr[i][j]=sc.next().charAt(0);
		        if(arr[i][j]=='A'){
		            Arow=i;
		            Acol=j;
		        }
		        if(arr[i][j]=='B'){
		            Brow=i;
		            Bcol=j;
		        }
		    }
		}
		boolean flagA,flagB;
		flagA=findA(R,C,Arow,Acol,arr);
		flagB=findB(R,C,Brow,Bcol,arr);
		if(flagA && flagB)System.out.print("BOTH");
        else if(flagA)System.out.print("A");
        else if(flagB)System.out.print("B");
        else System.out.print("NONE");

	}
	public static boolean findA(int R,int C,int row,int col,char[][] arr){
	    if(row<R && col<C && arr[row][col]=='1'){
	        if(arr[row][col]=='G')return true;
	        return findA(R,C,row+1,col,arr)||findA(R,C,row,col+1,arr);
	    }
	    return false;
	}
    public static boolean findB(int R,int C,int row,int col,char[][] arr){
	        if(row<R && col<C && arr[row][col]=='1'){
	        if(arr[row][col]=='G')return true;
	        return findB(R,C,row-1,col,arr)||findB(R,C,row,col-1,arr);
	    }
	    return false;
    }
}