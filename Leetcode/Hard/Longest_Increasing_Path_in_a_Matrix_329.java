package Leetcode.Hard;
public class Longest_Increasing_Path_in_a_Matrix_329 {
    int diff[][] = new int[][]{{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
    
    private int dfs(int[][] matrix, int[][] dp, int row, int col) {
        if (dp[row][col] != 0) return dp[row][col];
        int maxPath = 1;
        for (int[] d : diff) {
            int newRow = row + d[0];
            int newCol = col + d[1];
            if (newRow >= 0 && newRow < matrix.length && newCol >= 0 && newCol < matrix[0].length && matrix[newRow][newCol] > matrix[row][col]) {
                int length = 1 + dfs(matrix, dp, newRow, newCol);
                maxPath = Math.max(maxPath, length);
            }
        }
        dp[row][col] = maxPath;
        return maxPath;
    }
    
    public int longestIncreasingPath(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return 0;
        int R = matrix.length, C = matrix[0].length;
        int dp[][] = new int[R][C];
        int maxPath = 0;
        for (int row = 0; row < R; row++) {
            for (int col = 0; col < C; col++) {
                maxPath = Math.max(maxPath, dfs(matrix, dp, row, col));
            }
        }
        return maxPath;
    }
}