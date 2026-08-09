package AMAZON_PnL;

//Maximum Negative Groups in k groups problem from Amazon PnL Taxation 3rd question 

import java.util.Arrays;

public class amazon_pnl_tax {

    static int[] prefix;
    static int[][] dp;
    static int n;

    public static int maxNegativeGroups(int[] revenue, int k) {

        n = revenue.length;

        prefix = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + revenue[i];
        }

        dp = new int[n][k + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return solve(0, k);
    }

    static int solve(int index, int groupsLeft) {

        if (groupsLeft == 0) {
            return (index == n) ? 0 : Integer.MIN_VALUE;
        }

        if (index == n) {
            return Integer.MIN_VALUE;
        }

        if (dp[index][groupsLeft] != -1) {
            return dp[index][groupsLeft];
        }

        int maxNegativeGroups = Integer.MIN_VALUE;

        for (int end = index; end <= n - groupsLeft; end++) {

            int currentSum = prefix[end + 1] - prefix[index];

            int remaining = solve(end + 1, groupsLeft - 1);

            if (remaining == Integer.MIN_VALUE) {
                continue;
            }

            int currentGroup = (currentSum < 0) ? 1 : 0;

            maxNegativeGroups = Math.max(
                    maxNegativeGroups,
                    currentGroup + remaining
            );
        }

        return dp[index][groupsLeft] = maxNegativeGroups;
    }

    public static void main(String[] args) {

        int[] revenue = {2, -5, 1, -4, 3};
        int k = 3;

        System.out.println(maxNegativeGroups(revenue, k));
    }
}