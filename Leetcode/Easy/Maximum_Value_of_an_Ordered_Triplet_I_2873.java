package Leetcode.Easy;
public class Maximum_Value_of_an_Ordered_Triplet_I_2873 {
    public long maximumTripletValue(int[] nums) {
        int N=nums.length;
        long val=0;
        long maxDiff=0;
        long maxI=nums[0];
        for (int j = 1; j < N - 1; j++) {
            maxDiff = Math.max(maxDiff, maxI - nums[j]);
            maxI = Math.max(maxI, nums[j]);
            val = Math.max(val, maxDiff * nums[j + 1]);
        }

        return val;
    }
}