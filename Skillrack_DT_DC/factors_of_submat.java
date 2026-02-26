// package Skillrack_DT_DC;

import java.util.*;
public class factors_of_submat {


    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++)arr[i]=sc.nextInt();
        for(int i=0;i<N;){
            int pos=K,sum=0;
            while(pos-->0){
                if(i==N)return;
                sum=(sum*10)+arr[i]%10;
                i++;
            }
            List<Integer> factor= getfactors(sum);
            if(factor.size()==0)System.out.println("0");
            else {
                for(int f:factor){
                    System.out.print(f+" ");
                }
                System.out.println();
            }
        }
	}
	static List<Integer> getfactors(int num){
	    List<Integer> arr=new ArrayList<>();
	    for(int i=1;i<=Math.sqrt(num);i++){
	        if(num%i==0){
	            arr.add(i);
	            if(i*i!=num)arr.add(num/i);
	        }
	    }
	    Collections.sort(arr);
	    return arr;
	}
}