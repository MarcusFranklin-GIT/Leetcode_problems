package Skillrack_DT_DC;
import java.util.*;
public class Hprint_string_InMat {

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
		int row=0;
		int flag=0;
		boolean done=true;
		while(done){
		    for(int col=0;col<C;col++){
		        char c=arr[row][col];
		        if(c=='(')flag=1;
		        else if(c==')'&& flag==1){
		            done=false;
		            break;
		        }else if(flag==1){
		            System.out.print(c);
		        }
		    }
		    row=(row+1)%R;
		}

	}
}