
import java.io.*;
import java.util.*;

public class range2{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // Read n and q
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        long[] prefix = new long[n + 1];
        st = new StringTokenizer(br.readLine());
        
        // Build prefix sum array
        for (int i = 1; i <= n; i++) {
            prefix[i] = prefix[i - 1] + Long.parseLong(st.nextToken());
        }

        StringBuilder output = new StringBuilder();
        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            output.append(prefix[r] - prefix[l - 1]).append('\n');
        }

        System.out.print(output);
    }
}
