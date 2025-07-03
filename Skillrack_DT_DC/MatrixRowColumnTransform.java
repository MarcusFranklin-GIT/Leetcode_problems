
import java.util.*;

public class MatrixRowColumnTransform {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        int C = sc.nextInt();

        int[][] arr = new int[R][C];

        // Input the array
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Process columns
        for (int col = 0; col < C; col++) {
            int count = 0;

            // count zeroes in this column
            for (int row = 0; row < R; row++) {
                if (arr[row][col] == 0) count++;
            }

            // update this column: first count cells as 0, rest as 1
            for (int row = 0; row < R; row++) {
                if (row < count) {
                    arr[row][col] = 0;
                } else {
                    arr[row][col] = 1;
                }
            }
        }

        // Process rows
        for (int row = 0; row < R; row++) {
            int count = 0;

            // count ones in this row
            for (int col = 0; col < C; col++) {
                if (arr[row][col] == 1) count++;
            }

            // update this row: first count cells as 1, rest as 0
            for (int col = 0; col < C; col++) {
                if (col < count) {
                    arr[row][col] = 1;
                } else {
                    arr[row][col] = 0;
                }
            }
        }

        // Output the array
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
