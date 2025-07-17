import java.util.*;

public class Only_One_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            boolean[] digits = new boolean[10];
            int temp = x;
            while (temp > 0) {
                digits[temp % 10] = true;
                temp /= 10;
            }
            int y = 0;
            while (true) {
                int yTemp = y;
                if (y == 0 && digits[0]) {
                    System.out.println(0);
                    break;
                }
                while (yTemp > 0) {
                    if (digits[yTemp % 10]) {
                        System.out.println(y);
                        yTemp = -1; // found
                        break;
                    }
                    yTemp /= 10;
                }
                if (yTemp == -1) break;
                y++;
            }
        }
        sc.close();
    }
}