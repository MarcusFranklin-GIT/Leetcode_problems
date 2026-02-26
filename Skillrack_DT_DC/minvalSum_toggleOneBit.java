// package Skillrack_DT_DC;

import java.util.*;
public class minvalSum_toggleOneBit {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int sum=0;
		for(int i=0;i<N;i++){
		    int num=sc.nextInt();
		    int msb=Integer.highestOneBit(num);
		    sum+=num^msb;
		}
        System.out.print(sum+"..");
	}
}

//highestOneBit() returns an int value with at most a single one-bit, in the position of the highest-order ("leftmost") one-bit in the specified int value.