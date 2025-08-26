package DP;
//optimal DP by finding the maximum 2 values in each column
import java.util.*;
public class dont_take_next_col_val {

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
		for(int col=0;col<C-1;col++){
		    int max1=0,max2=0;
		    int ind=-1;
		    for(int row=0;row<R;row++){
		        
		        if(max1<arr[row][col]){
		            max2=max1;
		            max1=arr[row][col];
		            ind=row;
		        }else {
		            max2=Math.max(max2,arr[row][col]);
		        }
		    }
		    
		    for(int row=0;row<R;row++){
		        if(row==ind){
		            arr[row][col+1]+=max2;
		        }else{
		            arr[row][col+1]+=max1;
		        }
		    }
		}
		int ans=0;
        for(int row=0;row<R;row++){
            ans=Math.max(ans,arr[row][C-1]);
        }
        System.out.print(ans+".");
	}
}