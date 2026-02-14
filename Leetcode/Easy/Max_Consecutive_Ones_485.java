package Leetcode.Easy;

public class Max_Consecutive_Ones_485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l=0,r=0;
        int max=0;
        int len=nums.length;
        while(r<len){
            if(nums[r]==0)l=r+1;
            max=Math.max(r-l+1,max);
            r++;
        }
        return max;
    }
}