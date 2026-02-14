package Leetcode.Medium;
public class Maximum_Subarray_53 {
    public int maxSubArray(int[] nums) {
        int curr=Integer.MIN_VALUE;
        int max=0;
        for(int i=0;i<nums.length;i++){
            max+=nums[i];
            if(curr<max)curr=max;
            if(max<0)max=0;
        }
        return curr;
    }
}