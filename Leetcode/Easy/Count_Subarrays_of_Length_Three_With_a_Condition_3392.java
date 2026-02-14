package Leetcode.Easy;
public class Count_Subarrays_of_Length_Three_With_a_Condition_3392 {
    public int countSubarrays(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]+nums[i+2]==(nums[i+1]/2.0))count++;
        }
        return count;
    }
}