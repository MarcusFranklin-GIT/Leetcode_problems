public class Flood_Fill_733 {
    int diff[][] = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int R = image.length, C = image[0].length;
        int val = image[sr][sc];
        if (image[sr][sc] != color)
            dfs(sr, sc, R, C, image, color, val);
        return image;
    }

    public void dfs(int row, int col, int R, int C, int[][] image, int colour, int val) {
        image[row][col] = colour;
        for (int ptr = 0; ptr < 4; ptr++) {
            int adjR = diff[ptr][0] + row, adjC = diff[ptr][1] + col;
            if (adjR >= 0 && adjR < R && adjC < C && adjC >= 0 && image[adjR][adjC] == val) {
                dfs(adjR, adjC, R, C, image, colour, val);
            }
        }

    }
}