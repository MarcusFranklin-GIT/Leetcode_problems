package Leetcode.Medium;
public class Number_of_Islands_200 {
    public int numIslands(char[][] grid) {
        int count=0,R=grid.length,C=grid[0].length;
        for(int row=0;row<R;row++){
            for(int col=0;col<C;col++){
                if(grid[row][col]=='1'){
                count++;
                dfs(grid,row,col);
            }
            }
        }
        return count;
    }
    public void dfs(char [][] arr,int row,int col){
        if(row<0 ||col<0 ||row>=arr.length||col>=arr[0].length || arr[row][col]=='0'){
            return;
        }
        arr[row][col]='0';
        dfs(arr,row-1,col);
        dfs(arr,row+1,col);
        dfs(arr,row,col-1);
        dfs(arr,row,col+1);
    }
}