import java.util.*;
public class matrix_transpose {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		
		int R=sc.nextInt();
		int C=sc.nextInt();
		
		int [][] mat=new int[R][C];
		
		for(int i=0;i<R;i++){
		    for(int j=0;j<C;j++){
		        mat[i][j]=sc.nextInt();
		    }
		}
		
		for(int col=0;col<C;col++){
		    for(int row=0;row<R;row++){
		        System.out.print(mat[row][col]+" ");
		    }
		    System.out.println();
		}
        sc.close();
	}
}