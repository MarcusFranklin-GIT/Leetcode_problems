
import java.util.*;
public class check_validABCD {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int R=sc.nextInt();
		int C=sc.nextInt();
	    char arr[][]=new char[R][C];
	    for(int i=0;i<R;i++){
	        for(int j=0;j<C;j++){
	            arr[i][j]=sc.next().charAt(0);
	        }
	    }
	    int count=0;
	    for(int row=0;row<R;row+=2){
	        for(int col=0;col<C;col+=2){
	            count+=checker(arr,row,col);        
	        }
	    }
	    System.out.print(count);

	}
	public static int checker(char[][] arr,int row,int col){
	    int val=0;
	    int i=0;
	    for(int r=row;r<row+2;r++){
	        for(int c=col;c<col+2;c++){
	            if(arr[r][c]!=(char)('A'+i))val++;
	            i++;
	        }
	    }
	    return val;
	}
}

// A B
// C D
// ans=0;

// A B C D 
// C D C D
// A B A B
// C C D D 
//ANS = 4

