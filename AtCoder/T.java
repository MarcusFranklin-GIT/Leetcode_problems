import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int n = S.length();
        double max = 0.0;

        for (int start = 0; start < n; start++) {
            if (S.charAt(start) != 't') continue;
            for (int end = start + 2; end < n; end++) {
                if (S.charAt(end) != 't') continue;
                
                String sub = S.substring(start, end + 1);
                int tCount = countT(sub);
                
                double rate = (double) (tCount - 2) / (sub.length() - 2);
                max = Math.max(max, rate);
            }
        }

        System.out.printf("%.17f%n", max);
    }

    private static int countT(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == 't') count++;
        }
        return count;
    }
}
