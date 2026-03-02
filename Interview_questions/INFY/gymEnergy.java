import java.util.*;

public class gymEnergy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int E = sc.nextInt();
        int N = sc.nextInt();

        int[] A = new int[N];
        long drain = 0;

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            drain += 2L * A[i];
        }

        if (drain < E) {
            System.out.print(-1);
            return;
        }

        Arrays.sort(A);

        int count = 0;

        for (int i = N - 1; i >= 0 && E > 0; i--) {
            //ceiling division formula.
            int maxUse = Math.min(2, (E + A[i] - 1) / A[i]);

            E -= maxUse * A[i];
            count += maxUse;
        }

        System.out.print(count);
        sc.close();
    }
}