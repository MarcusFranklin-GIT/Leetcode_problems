package DP;
//bruit force DP
import java.util.*;
public class dont_take_next_row {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		int[][] arr = new int[R][C];
		for(int row = 0; row < R; row++){
		    for(int col = 0; col < C; col++){
		        arr[row][col] = sc.nextInt();
		    }
		}
        for(int row = 1; row < R; row++){
            for(int col = 0; col < C; col++){
                int val = arr[row][col];
                for(int c = 0; c < C; c++){
                    if(c == col) continue;
                    val = Math.max(val, arr[row][col] + arr[row-1][c]);
                }
                arr[row][col] = val;
            }
        }
        int maxi = 0;
        for(int row = 0; row < C; row++){
            maxi = Math.max(maxi, arr[R-1][row]);
        }
        System.out.println(maxi);
	}
}
