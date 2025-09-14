import java.util.*;
public class Main{
  public static void main(String [] args){
     Scanner sc = new Scanner(System.in);
     int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long m = sc.nextLong();

            long[] a = new long[n + 1];
            int[] b = new int[n + 1];
            a[0] = 0;
            b[0] = 0;

            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextLong();
                b[i] = sc.nextInt();
            }

            long ans = 0;

            for (int i = 1; i <= n; i++) {
                long d = a[i] - a[i - 1];
                int diff = Math.abs(b[i] - b[i - 1]);

                if (d < diff) {
                    ans = -1;
                } else {
                    if ((d - diff) % 2 == 0) {
                        ans += d;
                    } else {
                        ans += d - 1;
                    }
                }
            }
            long d = m - a[n];
            ans += d;
            System.out.println(ans);
        }
    }
}