
import java.util.*;
public class Bucket_ball_feb_12th {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		int N=sc.nextInt();
		int arr[][]=new int[T][N];
		for(int i=0;i<T;i++){
		    for(int j=0;j<N;j++){
		        arr[i][j]=sc.nextInt();
		    }
		}
		int K=sc.nextInt();
		int count=0;
		
		for(int row=T-1;row>=0;row--){
		    for(int col=0;col<N;col++){
		        if(row<T-1){
		            arr[row][col]+=arr[row+1][col];
		        }
		        
		        if(arr[row][col]>=K){
		            count++;
		            arr[row][col]=0;
		        }
		    }
		}
		System.out.print(count*K);

	}
}