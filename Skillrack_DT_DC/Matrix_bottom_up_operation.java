import java.util.Scanner;
public class Matrix_bottom_up_operation {
    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int R=sc.nextInt();
		int C=sc.nextInt();
		String [][]arr=new String[R][C];
		for(int i=0;i<R;i++){
		    for(int j=0;j<C;j++){
		        arr[i][j]=sc.next();
		    }
		}
		for(int row=1;row<R-1;row++){
		    for(int col=0;col<C;col++){
		        if(arr[row][col].equals("+")){
		            int val1=Integer.parseInt(arr[row-1][col]);
		            int val2=Integer.parseInt(arr[row+1][col]);
		            arr[row][col]=String.valueOf(val1+val2);
		        }
		        if(arr[row][col].equals("-")){
		            int val1=Integer.parseInt(arr[row-1][col]);
		            int val2=Integer.parseInt(arr[row+1][col]);
		            arr[row][col]=String.valueOf(Math.abs(val1-val2));
		        }
		    }
		}
		for(int i=0;i<R;i++){
		    for(int j=0;j<C;j++){
		        System.out.print(arr[i][j]+" ");
		    }
		    System.out.println();
		}
	}
}