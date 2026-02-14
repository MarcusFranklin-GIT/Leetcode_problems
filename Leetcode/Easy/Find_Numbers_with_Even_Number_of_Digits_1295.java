package Leetcode.Easy;
public class Find_Numbers_with_Even_Number_of_Digits_1295 {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int N:nums){
            int len=0;
            while(N!=0){
                len++;
                N/=10;
            }
            if(len%2==0)count++;
        }
        return count;
    }
}