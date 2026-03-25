public class Island_Perimeter_463 {
    public int islandPerimeter(int[][] grid) {
        int peri=0;
        
        int R=grid.length;
        int C=grid[0].length;

        for(int row=0 ; row<R ; row++){
            for(int col=0 ; col<C ; col++){
                if(grid[row][col]==1){
                    peri+=4;
                    if(row>0 && grid[row-1][col]==1)peri-=2;
                    if(col>0 && grid[row][col-1]==1)peri-=2;
                }
            }
        }
        return peri;
    }
}