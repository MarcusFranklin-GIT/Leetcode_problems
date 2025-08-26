package DP;

import java.util.*;
public class bottom_row_dont {

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
        int  sum1=0,sum2=0;
        for(int row=0;row<R;row++){
            int max=arr[row][0];
            for(int col=0;col<C;col++){
                max=Math.max(max,arr[row][col]);
            }
            if(row%2==0)sum1+=max;
            else sum2+=max;
        }
        System.out.print(Math.max(sum1,sum2));
	}
}

