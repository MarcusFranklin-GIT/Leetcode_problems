package Leetcode.Medium;
public class Number_of_Zero_Filled_Subarrays_2348 {
    public long zeroFilledSubarray(int[] nums) {
        int count=0;
        long ans=0;
         for (int num : nums) {
            if (num == 0) {
                count++;
                ans += count;
            } else {
                count = 0;
            }
        }

        return ans;
    }
}