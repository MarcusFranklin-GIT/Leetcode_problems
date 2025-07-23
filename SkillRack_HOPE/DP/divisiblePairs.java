package DP;

import java.util.Scanner;
public class divisiblePairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] fre=new int[6];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;

        for(int i=0;i<n;i++){
            int R=arr[i]%10;
            if(R<6 && R>0){
                if(fre[R]==0){
                    fre[R]++;
                   
                }else{
                    fre[R]++; 
                    count++;
                }
            }
            else if(R==0){
                if(fre[0]==0)fre[0]++;
                else{
                    fre[0]--;
                    count++;
                }
            }
            else if(R==5){
                if(fre[6]==0)fre[6]++;
                else {
                    fre[6]--;
                    count++;
                }
            }
            else {
                if(fre[10-R]>0){
                    fre[10-R]--;
                    count++;
                }else{
                    fre[10-R]--;
                }
            }
        }
      System.out.println(count);
    }
}
