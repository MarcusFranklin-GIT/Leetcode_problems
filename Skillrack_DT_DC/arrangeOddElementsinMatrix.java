import java.util.PriorityQueue;
import java.util.Scanner;

public class arrangeOddElementsinMatrix {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		PriorityQueue<Integer> PQ=new PriorityQueue<>();
		int R=sc.nextInt();
		int C=sc.nextInt();
		int mat[][]=new int[R][C];
		for(int row=0;row<R;row++){
		    for(int col=0;col<C;col++){
		        mat[row][col]=sc.nextInt();
		        if(mat[row][col]%2!=0){
		            PQ.add(mat[row][col]);
		        }
		    }
		}
		for(int row=0;row<R;row++){
		    for(int col=0;col<C;col++){
		        if(mat[row][col]%2==0){
		            System.out.print(mat[row][col]+" ");
		        }else{
		            System.out.print(PQ.poll()+" ");		    
		        }
		    }
		    System.out.println();
		}
        sc.close();
	}
}