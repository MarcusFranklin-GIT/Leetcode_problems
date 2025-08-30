
import java.util.*;
public class increasing_submatrix {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int M=sc.nextInt();
		int N=sc.nextInt();
		int len=M*N;
		int arr[][]=new int[len][len];
		int val=1;
		for(int row=0;row<len;row+=M){
		    for(int col=0;col<len;col+=M){
		        fill(row,col,arr,val,M);
		        val++;
		    }
		}
		for(int i=0;i<len;i++){
		    for(int j=0;j<len;j++){
		        System.out.print(arr[i][j]+" ");
		    }
		    System.out.println();
		}
	}
	public static void fill(int R,int C,int[][] arr,int val,int M){
	    for(int row=R;row<R+M;row++){
	        for(int col=C;col<C+M;col++){
	            arr[row][col]=val++;
	        }
	    }
	}
}