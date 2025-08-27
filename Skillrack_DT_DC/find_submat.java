
import java.util.*;
public class find_submat {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int R=sc.nextInt();
		int C=sc.nextInt();
		int mat[][]=new int[R][C];
		for(int i=0;i<R;i++){
		    for(int j=0;j<C;j++){
		        mat[i][j]=sc.nextInt();
		    }
		}
		int count=0;
		
		for(int r=0;r<=R-3;r++){
		    for(int c=0;c<=C-3;c++){
		        if(equal(r,c,mat))count++;
		    }
		}
		System.out.print(count);

	}
	
	public static boolean equal(int row,int col,int mat[][]){
	    int arr[][]={{1,0,1},{0,1,0},{1,0,1}};
	    for(int i=0;i<3;i++){
	        for(int j=0;j<3;j++){
	            if(arr[i][j]!=mat[row+i][col+j])return false;
	        }
	    }
	    return true;
	}
}