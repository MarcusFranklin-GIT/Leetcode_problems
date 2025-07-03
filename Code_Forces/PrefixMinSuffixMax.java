import java.util.*;

public class PrefixMinSuffixMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            // Build prefix min array
            int[] prefixMin = new int[n];
            prefixMin[0] = a[0];
            for (int i = 1; i < n; i++) {
                prefixMin[i] = Math.min(prefixMin[i-1], a[i]);
            }
            
            // Build suffix max array
            int[] suffixMax = new int[n];
            suffixMax[n-1] = a[n-1];
            for (int i = n-2; i >= 0; i--) {
                suffixMax[i] = Math.max(suffixMax[i+1], a[i]);
            }
            
            StringBuilder result = new StringBuilder();
            
            for (int i = 0; i < n; i++) {
                if (a[i] == prefixMin[i] || a[i] == suffixMax[i]) {
                    result.append('1');
                } else {
                    result.append('0');
                }
            }
            
            System.out.println(result.toString());
        }
        
        sc.close();
    }
}
