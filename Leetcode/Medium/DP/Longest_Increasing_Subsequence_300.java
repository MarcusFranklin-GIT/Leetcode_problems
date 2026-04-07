public class Longest_Increasing_Subsequence_300 {
    public int lengthOfLIS(int[] nums) {
        int len = nums.length;

        int dp[] = new int[len];

        for(int i=0;i<len;i++)dp[i]=1;

        int max=1;

        for(int i=0;i<len;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
            max=Math.max(dp[i],max);
        }

        return max;
    }
}