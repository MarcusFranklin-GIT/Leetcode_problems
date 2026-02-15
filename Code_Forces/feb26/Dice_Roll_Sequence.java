package feb26;
import java.io.*;
import java.util.*;

public class Dice_Roll_Sequence {
    static boolean allowed(int prevVal, int curVal) {
        if (prevVal == curVal) return false;
        if (prevVal + curVal == 7) return false;
        return true;
    }

    public static void main(String[] args) throws Exception {

        InputReader in = new InputReader(System.in);
        StringBuilder result = new StringBuilder();

        int testCases = in.nextInt();

        while (testCases-- > 0) {

            int length = in.nextInt();
            int[] arr = new int[length];

            for (int i = 0; i < length; i++) {
                arr[i] = in.nextInt();
            }

            final int LIMIT = 1_000_000_000;

            int[] dp = new int[7];

            for (int v = 1; v <= 6; v++) {
                dp[v] = (arr[0] == v) ? 0 : 1;
            }

            for (int i = 1; i < length; i++) {

                int[] newDp = new int[7];
                Arrays.fill(newDp, LIMIT);

                for (int currentValue = 1; currentValue <= 6; currentValue++) {

                    int modifyCost = (arr[i] == currentValue) ? 0 : 1;

                    int bestTransition = LIMIT;

                    for (int previousValue = 1; previousValue <= 6; previousValue++) {
                        if (allowed(previousValue, currentValue)) {
                            bestTransition = Math.min(
                                bestTransition,
                                dp[previousValue]
                            );
                        }
                    }

                    if (bestTransition != LIMIT) {
                        newDp[currentValue] = bestTransition + modifyCost;
                    }
                }

                dp = newDp;
            }

            int minimumChanges = LIMIT;
            for (int v = 1; v <= 6; v++) {
                minimumChanges = Math.min(minimumChanges, dp[v]);
            }

            result.append(minimumChanges).append('\n');
        }

        System.out.print(result);
    }

    static class InputReader {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
        }

        String next() throws IOException {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }
            return tokenizer.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
    }
}