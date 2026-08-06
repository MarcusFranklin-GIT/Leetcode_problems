import java.util.*;
public class Sub_matrix_search {

    public static void main(String[] args) {
		//Your Code Here
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int matrix[][] = new int[N][N];
		int sub[][] = new int[M][M];
		
		for(int row=0;row<N;row++){
		    for(int col=0;col<N;col++){
		        matrix[row][col]=sc.nextInt();
		    }
		}
		
		for(int i=0;i<M;i++){
		    for(int j=0;j<M;j++){
		        sub[i][j]=sc.nextInt();
		    }
		}
		
		for(int row=0;row<=N-M;row++){
		    for(int col=0;col<=N-M;col++){
		        if(matrix[row][col]==sub[0][0]){
		            if(check(row,col,M,matrix,sub)){
		                System.out.print("TRUE");
		                return;
		            }
		        }
		    }
		}
        System.out.print("FALSE");
	}
	
	private static boolean check(int row,int col,int M,int[][] matrix,int[][] sub){
	    for(int i=0;i<M;i++){
	        for(int j=0;j<M;j++){
	            if(sub[i][j]!=matrix[row+i][col+j])return false;
	        }
	    }
	    return true;
	}
}


//two matrix are given as input 
//Check one is a sub matrix of the other or not