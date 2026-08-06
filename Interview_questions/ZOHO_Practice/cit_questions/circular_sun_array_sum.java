public class circular_sun_array_sum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] nums = {1, -2, 3, -2};
        
        int result = solution.maxSubarraySumCircular(nums);
        System.out.println("Maximum Circular Subarray Sum: " + result); // Output: 3
    }
}
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int currmax =0;
        int MAX = nums[0];
        int currmin = 0;
        int MIN = nums[0];
        int total=0;

        for(int i=0;i<nums.length;i++){
            total+=nums[i];

            currmax = Math.max(nums[i],currmax+nums[i]);
            MAX = Math.max(currmax,MAX);

            currmin = Math.min(nums[i],currmin+nums[i]);
            MIN = Math.min(currmin,MIN); 
        }
        if(MAX<0)return MAX;

        return Math.max(MAX,total-MIN);
    }
}