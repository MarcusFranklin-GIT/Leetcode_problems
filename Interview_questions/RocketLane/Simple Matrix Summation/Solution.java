import java.util.*;

public class Solution {

    public static List<List<Integer>> matrixSummation(List<List<Integer>> a) {
        int R = a.size();
        int C = a.get(0).size();

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < R; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < C; j++) {

                int sum = a.get(i).get(j);

                if (i > 0) sum += result.get(i - 1).get(j);
                if (j > 0) sum += row.get(j - 1);
                if (i > 0 && j > 0) sum -= result.get(i - 1).get(j - 1);

                row.add(sum);
            }
            result.add(row);
        }

        return result;
    }

    public static void main(String[] args) {
        List<List<Integer>> a = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5, 6),
            Arrays.asList(7, 8, 9)
        );

        List<List<Integer>> result = matrixSummation(a);

        for (List<Integer> row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}