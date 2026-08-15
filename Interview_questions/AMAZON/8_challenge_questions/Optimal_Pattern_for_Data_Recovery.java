import java.util.*;

public class  Optimal_Pattern_for_Data_Recovery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Note: Check how your environment passes the inputs.
        // Assuming patternLength first, then lostData based on the function signature.
        int patternLength = sc.nextInt();
        String lostData = sc.next();

        System.out.println(getSmallestBaseSegment(patternLength, lostData));

        sc.close();  
    }

    public static String getSmallestBaseSegment(int patternLength, String lostData) {
        int[] fre = new int[26];
        int maxFreq = 0;
        int distinct = 0;
        
        // Find the frequency of the letters in the word
        for(char ch : lostData.toCharArray()) {
            if (fre[ch - 'a'] == 0) {
                distinct++;
            }
            fre[ch - 'a']++;
            maxFreq = Math.max(maxFreq, fre[ch - 'a']);
        }
        
        // If there are more distinct characters than the pattern length, it's impossible.
        if (distinct > patternLength) {
            return "-1";
        }

        // Binary search for the minimum number of copies (k)
        int start = 1;
        int end = maxFreq;
        String res = "-1";

        while (start <= end) {
            int k = start + (end - start) / 2;
            String val = checkPossible(k, fre, patternLength);
            
            if (val != null) {
                res = val;       // This 'k' works, save the result
                end = k - 1;     // Try to find a smaller number of copies
            } else {
                start = k + 1;   // 'k' is too small, we need more copies
            }
        }

        return res;
    }

    private static String checkPossible(int k, int[] fre, int pl) {
        int[] req = new int[26];
        int requiredLength = 0;

        // Calculate how many times each character must appear in the pattern
        for (int i = 0; i < 26; i++) {
            if (fre[i] == 0) continue;
            // Ceiling division for integers: ceil(fre[i] / k)
            req[i] = (fre[i] + k - 1) / k; 
            requiredLength += req[i];
        }

        // If the minimum characters we need exceed the pattern length, this 'k' fails
        if (requiredLength > pl) {
            return null;
        }

        // We want the result to be lexicographically smallest.
        // The smallest character is 'a'. We pad any leftover length directly onto 'a'
        int diff = pl - requiredLength;
        req[0] += diff;

        // Build the result string in alphabetical order
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < req[i]; j++) {
                res.append((char)('a' + i));
            }
        }

        return res.toString();
    }
}