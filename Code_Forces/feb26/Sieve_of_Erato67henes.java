package feb26;
import java.util.*;

public class Sieve_of_Erato67henes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        while (test-- > 0) {
            int N = sc.nextInt();
            boolean found = false;

            for (int i = 0; i < N; i++) {
                int num = sc.nextInt();
                if (num == 67) {
                    found = true;
                }
            }

            if (found) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
