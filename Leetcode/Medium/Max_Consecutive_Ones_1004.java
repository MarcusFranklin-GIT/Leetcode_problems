package Leetcode.Medium;
public class Max_Consecutive_Ones_1004{
    public int longestOnes(int[] nums, int k) {
        int len=nums.length;
        int zeros=0;
        int left=0,right=0;
        int currlen=0,maxlen=0;

        while(right<len){
            if(nums[right]==0)zeros++;
            while(zeros>k){
                if(nums[left]==0)zeros--;
                left++;
            }
            if(zeros<=k){
                currlen=right-left+1;
                maxlen=Math.max(maxlen,currlen);
            }
            right++;
        }
        return maxlen;
    }
}