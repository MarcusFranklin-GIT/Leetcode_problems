import java.util.*;
public class fourside_fill {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        int D=sc.nextInt();
        int N=sc.nextInt();
        
        int [][]matrix=new int[N][N];
        
        for(int layer=0;layer<(N/2);layer++){
            matrix[layer][layer]=A;
            matrix[layer][N-1-layer]=B;
            matrix[N-1-layer][N-1-layer]=C;
            matrix[N-1-layer][layer]=D;
            for(int ind=layer+1;ind<(N-1-layer);ind++){
                //right to left
                matrix[layer][ind]=matrix[layer][ind-1]+1;
                //top to bottom
                matrix[ind][N-1-layer]=matrix[ind-1][N-1-layer]+1;
                //left to right
                matrix[N-1-layer][N-1-ind]=matrix[N-1-layer][N-ind]+1;
                //bottom to top
                matrix[N-1-ind][layer]=matrix[N-ind][layer]+1;
            }
        }
            for(int row=0;row<N;row++){
                for(int col=0;col<N;col++){
                    System.out.print(matrix[row][col]+" ");
                }
                System.out.println();
            }
        
	}
}