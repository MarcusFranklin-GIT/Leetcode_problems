import java.io.*;
import java.util.*;

public class Solution {
    
    private static int check(int[][] arr, int r, int c){
        int sum = 0;
        for(int i = r; i < r + 3; i++){
            for(int j = c; j < c + 3; j++){
                if((i == r + 1 && j == c) || (i == r+1 && j == c+2)) continue;
                sum = sum + arr[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int row = 0; row < n; row++){
            for(int col = 0; col < m; col++){
                arr[row][col] = sc.nextInt();
            }
        }
        int maxi = -1;
        for(int row = 0; row <= n - 3; row++){
            for(int col = 0; col <= m - 3; col++){
                maxi = Math.max(maxi, check(arr, row, col));
            }
        }
        System.out.println(maxi);
    }
}

//input
// 1 2 3
// 4 5 6
// 7 8 9
//output
// 1 2 3 
//   5
// 7 8 9  //total val =35 