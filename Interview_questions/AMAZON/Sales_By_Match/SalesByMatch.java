import java.util.*;

public class SalesByMatch {

    public static int sockMerchant(int[] socks) {

        HashMap<Integer, Integer> frequency = new HashMap<>();
        int pairs = 0;

        for (int color : socks) {

            if (!frequency.containsKey(color)) {
                frequency.put(color, 1);
            } else {
                frequency.put(color, frequency.get(color) + 1);

                // Every even occurrence forms a new pair
                if (frequency.get(color) % 2 == 0) {
                    pairs++;
                }
            }
        }

        return pairs;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] socks = new int[n];

        for (int i = 0; i < n; i++) {
            socks[i] = sc.nextInt();
        }

        System.out.println(sockMerchant(socks));

        sc.close();
    }
}