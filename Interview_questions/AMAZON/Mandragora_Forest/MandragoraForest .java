import java.util.*;

class MandragoraForest {

    public static long mandragora(int[] H) {

        Arrays.sort(H);

        long totalSum = 0;
        for (int health : H) {
            totalSum += health;
        }

        long prefixSum = 0;
        long health = 1;
        long maxExperience = 0;

        for (int i = 0; i < H.length; i++) {

            long remainingSum = totalSum - prefixSum;
            maxExperience = Math.max(maxExperience, remainingSum * health);

            prefixSum += H[i];
            health++;
        }

        // Case where no mandragora is eaten
        maxExperience = Math.max(maxExperience, (totalSum - prefixSum) * health);

        return maxExperience;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] H = new int[n];

        for (int i = 0; i < n; i++) {
            H[i] = sc.nextInt();
        }

        System.out.println(mandragora(H));

        sc.close();
    }
}