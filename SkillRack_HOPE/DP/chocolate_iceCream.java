package DP;

import java.util.*;
public class chocolate_iceCream {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		long A=2;
		long B=3;
		long C=0;
		int N=sc.nextInt();
		if(N==1)System.out.print(A);
		if(N==2)System.out.print(B);
		else{
		    for(int i=2;i<N;i++){
		        C=A+B;
		        A=B;
		        B=C;
		    }
		}
		System.out.print(B);
		

	}
}


//to find how many no of ways a boy can eat chocolate 
// he can eat chocolate everyday but ice cream not continuous