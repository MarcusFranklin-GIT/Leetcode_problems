package feb26;
import java.util.*;

public class Heapify_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }

            boolean[] seen = new boolean[n + 1];
            boolean ok = true;

            for (int i = 1; i <= n && ok; i++) {

                if (seen[i]) continue;

                List<Integer> idxList = new ArrayList<>();
                List<Integer> valList = new ArrayList<>();

                int cur = i;
                while (cur <= n && !seen[cur]) {
                    seen[cur] = true;
                    idxList.add(cur);
                    valList.add(a[cur]);
                    cur = cur * 2;
                }

                Collections.sort(idxList);
                Collections.sort(valList);

                for (int j = 0; j < idxList.size(); j++) {
                    if (!idxList.get(j).equals(valList.get(j))) {
                        ok = false;
                        break;
                    }
                }
            }

            System.out.println(ok ? "YES" : "NO");
        }

        sc.close();
    }
}