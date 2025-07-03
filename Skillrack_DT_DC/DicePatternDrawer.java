import java.util.*;

public class DicePatternDrawer {

    public static void main(String[] args) {
        // Scanner for input
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        for (int i = 0; i < S.length(); i++) {
            switch (S.charAt(i)) {
                case '1':
                    System.out.print("- - -\n- *\n- -\n");
                    break;

                case '2':
                    System.out.print("* -\n- -\n- - *\n");
                    break;

                case '3':
                    System.out.print("* -\n- * -\n- *\n");
                    break;

                case '4':
                    System.out.print("* - *\n- *\n* - *\n");
                    break;

                case '5':
                    System.out.print("* -\n- * -\n* - *\n");
                    break;

                case '6':
                    System.out.print("* - *\n* *\n* *\n");
                    break;

                default:
                    System.out.println("Invalid digit: " + S.charAt(i));
            }
        }

        sc.close();
    }
}
