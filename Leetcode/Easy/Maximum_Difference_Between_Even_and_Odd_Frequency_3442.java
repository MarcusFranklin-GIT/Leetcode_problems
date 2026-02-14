package Leetcode.Easy;
public class Maximum_Difference_Between_Even_and_Odd_Frequency_3442 {
    public int maxDifference(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        int maxDiff = Integer.MIN_VALUE;
        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 == 1) { 
                for (int j = 0; j < 26; j++) {
                    if (freq[j] % 2 == 0 && freq[j] > 0) {
                        int diff = freq[i] - freq[j];
                        maxDiff = Math.max(maxDiff, diff);
                    }
                }
            }
        }
        return maxDiff;
    }
}