package DP;

import java.util.*;
public class Non_adjacent_addition {
    //house robber problem
    public static void main(String[] args) {
		try (//Your Code Here
        Scanner sc = new Scanner(System.in)) {
            int N=sc.nextInt();
            int arr[]= new int[N];
            for(int i=0;i<N;i++)arr[i]=sc.nextInt();
            
            int prev1=0,prev2=0;
            
            for(int num: arr){
                int temp=prev1;
                prev1=Math.max(prev1,prev2+num);
                prev2=temp;
            }
            
            System.out.print(prev1+" ..");
        }
	}
}
// question: Given an array of integers representing the amount of money of each house, find the maximum amount of money that can be robbed without robbing two adjacent houses.
// The output is the maximum amount of money that can be robbed without robbing two adjacent houses