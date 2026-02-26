// package Skillrack_DT_DC;
import java.util.*;

public class Arrange_string_values {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine().trim();  // unique alphabets
        int N = sc.nextInt();
        sc.nextLine(); // consume newline

        // store strings in map by their middle character
        Map<Character, String> map = new HashMap<>();
        int length = 0; // common string length (all same odd length)

        for (int i = 0; i < N; i++) {
            String word = sc.nextLine().trim();
            length = word.length();
            char mid = Character.toLowerCase(word.charAt(length / 2));
            map.put(mid, word);
        }

        // Process each char in S
        for (char ch : S.toCharArray()) {
            char lowerCh = Character.toLowerCase(ch);

            if (map.containsKey(lowerCh)) {
                System.out.println(map.get(lowerCh));
            } else {
                // build stars with ch in middle
                char[] arr = new char[length];
                Arrays.fill(arr, '*');
                arr[length / 2] = ch;
                System.out.println(new String(arr));
            }
        }
    }
}
