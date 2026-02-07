package Leetcode.Medium;
public class Count_Unguarded_Cells_in_the_Grid_2257 {
    public static void main(String[] args) {
        Solution sol=new Solution();
        int m=4,n=6;
        int guards[][]={{0,0},{1,1},{2,3}};
        int walls[][]={{0,1},{2,2},{1,4}};
        System.out.println(sol.countUnguarded(m,n,guards,walls));
    }
}
class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int grid[][]=new int[m][n];
        int count=0;
        for(int[] wall:walls){
            grid[wall[0]][wall[1]]=-1;
            count++;
        }
        for(int[] g:guards){
            count++;
            grid[g[0]][g[1]]=1;
        }
        for(int []G:guards){
            count+=mark(m,n,G[0],G[1],grid);
        }
        return n*m-count;
    }
    public static int mark(int R,int C,int row,int col,int[][] grid){
        int dir[][]={{0,1},{0,-1},{1,0},{-1,0}};
        int count=0;
        for(int []d:dir){
            int curR=row+d[0];
            int curC=col+d[1];
            while(curR>=0 && curR<R && curC>=0 && curC<C && grid[curR][curC]!=-1 && grid[curR][curC]!=1){
                if(grid[curR][curC]==0){
                    grid[curR][curC]=2;
                    count++;
                }
                curR+=d[0];
                curC+=d[1];
            }
        }
        return count;
    }
}

//first place all the walls and guards in the grid
//then for each guard mark all the cells in 4 directions until a wall or another guard is found
//while marking if a cell is already marked do not increase the count
//finally return total cells - (walls + guards + marked cells)