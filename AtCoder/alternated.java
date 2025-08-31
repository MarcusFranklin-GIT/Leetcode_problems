import java.util.*;

public class alternated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.next();
        String S = sc.nextLine();

        List<Integer> posA = new ArrayList<>();
        for (int i = 0; i < 2 * N; i++) {
            if (S.charAt(i) == 'A') posA.add(i);
        }long cost1 = 0, cost2 = 0;
        
        for (int i = 0; i < N; i++) {
            int even = 2 * i;
            int odd  = 2 * i + 1;
            cost1 += Math.abs(posA.get(i) - even);
            cost2 += Math.abs(posA.get(i) - odd);
        }


        System.out.println(Math.min(cost1, cost2));
    }
}
