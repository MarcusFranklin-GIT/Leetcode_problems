// package Skillrack_DT_DC;
import java.util.*;
public class flowchart1 {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int M=sc.nextInt();
		int N=sc.nextInt();
		int P=0;
		while(M>0 || N>0){
		    if(M%10!=N%10){
		    if( M%10 > N%10){
		        System.out.print(M%10);
		    }else{
		        System.out.print(N%10);
		    }
		    P=1;
		    }
		    N/=10;
		    M/=10;
		}
		if(P==0){
		    System.out.print("-1");
		}

	}
}