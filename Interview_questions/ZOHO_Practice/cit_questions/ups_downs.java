import java.util.*;


public class ups_downs {
    public static int[] rearrange(int[] arr, int k) {
        int n = arr.length;
        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        // Peak positions: 0, 2, 4, ... → count = ceil(n/2)
        // Valley positions: 1, 3, 5, ... → count = floor(n/2)
        int peakCount = (n + 1) / 2;
        int valleyCount = n / 2;

        // Give the largest values to peaks, smallest values to valleys.
        // This maximizes the gap on every adjacent pair, giving the best
        // chance of satisfying the K constraint.
        int[] valleys = Arrays.copyOfRange(sorted, 0, valleyCount);   // smaller half
        int[] peaks = Arrays.copyOfRange(sorted, valleyCount, n);     // larger half

        int[] result = new int[n];
        int pi = 0, vi = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                result[i] = peaks[pi++];
            } else {
                result[i] = valleys[vi++];
            }
        }

        return isValid(result, k) ? result : null;
    }

    private static boolean isValid(int[] a, int k) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            boolean shouldBePeakEdge = (i % 2 == 0); // a[i] should be > a[i+1]
            if (shouldBePeakEdge) {
                if (a[i] <= a[i + 1]) return false;
            } else {
                if (a[i] >= a[i + 1]) return false;
            }
            if (Math.abs((long) a[i] - a[i + 1]) < k) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int[] result = rearrange(arr, k);
        if (result == null) {
            System.out.println(-1);
        } else {
            StringBuilder sb = new StringBuilder();
            for (int x : result) sb.append(x).append(" ");
            System.out.println(sb.toString().trim());
        }
    }
}