package Leetcode.Easy;

public class Two_Sum_1 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 1 ; i < nums.length; i++) {
            for (int y = i; y< nums.length; y++){
                if (target == nums[y] + nums[y-i])
                return new int[]{y , y-i};
            }
        }
        return null;
    }
}
