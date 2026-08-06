import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
public class order_round_char {
    public static String rearrange(String s) {
        // Track first-occurrence order of distinct characters
        LinkedHashMap<Character, Integer> counts = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            counts.merge(c, 1, Integer::sum);
        }

        List<Character> order = new ArrayList<>(counts.keySet());
        StringBuilder sb = new StringBuilder(s.length());

        int remaining = s.length();
        while (remaining > 0) {
            for (char c : order) {
                int cnt = counts.get(c);
                if (cnt > 0) {
                    sb.append(c);
                    counts.put(c, cnt - 1);
                    remaining--;
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(rearrange("cccaabbbbcc")); // cabcabcbcbc
        System.out.println(rearrange("banana"));       // banana
    }
}