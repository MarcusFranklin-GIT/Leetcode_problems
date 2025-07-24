import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int R=sc.nextInt();
		int C=sc.nextInt();
		int mat[][]=new int[R][C];
		for(int row=0;row<R;row++){
		    for(int col=0;col<C;col++){
		        mat[row][col]=sc.nextInt();
		    }
		}
		int arr[][]= new int[R][2];
		int Col=0,flag=0;
		while(Col<C && flag==0){
			flag=1;
		    call(mat,Col,R,0,arr);
		    call(mat,C-Col,R,1,arr);
		    for( int a=0;a<R;a++){
		        if(arr[0][a]!=arr[1][a]/2){
		          flag=0;
		        }
		    }
		    
		}
		for(int row=0;row<R;row++){
		    for(int col=0;col<=Col;col++){
		        System.out.print(mat[row][col]+" ");
		    }
		    System.out.println();
		}
		
		
		for(int row=0;row<R;row++){
		    for(int col=0;col<C-Col;col++){
		        System.out.print(mat[row][col]+" ");
		    }
		    System.out.println();
		}

	}
	private static void call(int mat[][],int C,int R,int index,int arr[][]){
	    for(int i=0;i<R;i++){
	        for(int j=0;j<C;j++){
	            arr[index][i]+=mat[i][j];
	        }
	    }
	    
	} 
} 