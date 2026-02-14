package Leetcode.Easy;
public class Maximum_Difference_Between_Adjacent_Elements_in_a_Circular_Array_3423 {
    public int maxAdjacentDistance(int[] nums) {
        int max=Math.abs(nums[0]-nums[nums.length-1]);
        for(int i=0;i<nums.length-1;i++){
            max=Math.max(Math.abs(nums[i]-nums[i+1]),max);
        }
        return max;
    }
}