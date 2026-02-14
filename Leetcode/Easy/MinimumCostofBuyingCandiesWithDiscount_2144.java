package Leetcode.Easy;
import java.util.Arrays;

public class MinimumCostofBuyingCandiesWithDiscount_2144 {

    // Approach 1: Sort and skip every 3rd item (from the back)
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int len = cost.length;
        int amt = 0;
        int count = 0;
        for (int i = len - 1; i >= 0; i--) {
            count++;
            if (count == 3) {
                count = 0; // skip this (free candy)
            } else {
                amt += cost[i];
            }
        }
        return amt;
    }

    // Approach 2: Counting sort (O(n) time, values in range [1, 100])
    public int minimumCostCountingSort(int[] cost) {
        int[] candies = new int[101];

        for (int c : cost) {
            candies[c]++;
        }

        int i = 100;
        int total = 0;
        int c = 0;
        while (i >= 0) {
            if (candies[i] > 0) {
                c++;
                if (c < 3) {
                    total += i;
                }
                --candies[i];
                if (c == 3) {
                    c = 0;
                }
            } else {
                i--;
            }
        }

        return total;
    }
}