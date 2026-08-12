// package Interview_questions.AMAZON.8_challenge_questions;
import java.util.ArrayList;
import java.util.List;
public class Error_codes_by_rarity {
    public int[] sortBugReportFrequencies(int[] errors) {
        int n = errors.length;
        
        // 1. Use an array for O(1) ultra-fast frequency counting
        // Size is 10^6 + 1 to accommodate the maximum possible error code
        
        int[] freq = new int[1000001];
        for (int error : errors) {
            freq[error]++;
        }

        // 2. Collect only the unique error codes
        List<Integer> uniqueErrors = new ArrayList<>();
        for (int i = 0; i <= 1000000; i++) {
            if (freq[i] > 0) {
                uniqueErrors.add(i);
            }
        }

        // 3. Sort using List.sort() (uses Timsort, which is highly optimized)
        uniqueErrors.sort((a, b) -> {
            if (freq[a] != freq[b]) {
                return Integer.compare(freq[a], freq[b]); // Sort by frequency
            }
            return Integer.compare(a, b); // Sort by value
        });

        // 4. Reconstruct the final array
        int[] res = new int[n];
        int ind = 0;
        for (int error : uniqueErrors) {
            int count = freq[error];
            while (count-- > 0) {
                res[ind++] = error;
            }
        }

        return res;
    }
}
