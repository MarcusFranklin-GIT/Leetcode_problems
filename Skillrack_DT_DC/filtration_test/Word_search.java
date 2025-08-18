package filtration_test;

import java.util.Scanner;

public class Word_search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int R=sc.nextInt();
        int C=sc.nextInt();
        char[][] grid=new char[R][C];
        for(int row=0;row<R;row++){
            for(int col=0;col<C;col++){
                grid[row][col]=sc.next().charAt(0);
            }
        } 
         sc.nextLine();
        String S=sc.nextLine();
        int len=S.length();
        boolean flag;


        for(int row=0;row<R;row++){
            for(int col=0;col<C;col++){
                if(grid[row][col]==S.charAt(0)){
                    flag=dfs(R,C,row,col,grid,S,len,0);
                    if(flag){
                        System.out.print("yes");
                        return;
                    }
                }
            }
        }
        System.out.print("no");
    }
     public static boolean dfs(int R, int C, int row, int col, char[][] grid, String S, int len, int pos) {
        if (row >= R || col >= C || grid[row][col] != S.charAt(pos)) return false;

        if (pos == len - 1) return true;

        return dfs(R, C, row + 1, col, grid, S, len, pos + 1)||dfs(R, C, row, col + 1, grid, S, len, pos + 1);
    }
    
}
