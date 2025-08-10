import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        sc.nextLine();
        
        String S = sc.nextLine();
        
        if (S.length() >= 3 && 
            S.charAt(S.length() - 1) == 'a' &&
            S.charAt(S.length() - 2) == 'e' &&
            S.charAt(S.length() - 3) == 't') {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
