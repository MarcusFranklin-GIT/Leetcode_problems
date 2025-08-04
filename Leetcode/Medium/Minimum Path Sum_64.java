class Solution {
    public int minPathSum(int[][] grid) {
        int R=grid.length,C=grid[0].length;
        for(int col=1;col<C;col++){
            grid[0][col]+=grid[0][col-1];
        }
        for(int row=1;row<R;row++){
            grid[row][0]+=grid[row-1][0];
        }
        for(int row=1;row<R;row++){
            for(int col=1;col<C;col++){
                grid[row][col]+=Math.min(grid[row][col-1],grid[row-1][col]);
            }
        }
        return grid[R-1][C-1];
    }
}