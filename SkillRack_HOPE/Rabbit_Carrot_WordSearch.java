
import java.util.*;
public class Rabbit_Carrot_WordSearch {
    static int[][] diff = {{0,1}, {0,-1}, {1,0},{-1,0},{1,1}, {-1,1}}; 
    
    private static boolean dfs(int R, int C, int row, int col, char[][] grid, int ind, boolean[][] visited, String word){
        if(ind == word.length()) return true;
        if(word.charAt(ind) != grid[row][col]) return false;
        
        visited[row][col] = true;
        
        for(int[] d : diff){
            int adjrow = row+d[0];
            int adjcol = col+d[1];
            if(adjrow >= 0 && adjcol >= 0 && adjrow < R && adjcol < C && !visited[adjrow][adjcol]){
                if(dfs(R,C,adjrow,adjcol,grid,ind+1,visited,word))
                    return true;
            }
        }
        
        visited[row][col] = false; // backtrack
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        char[][] grid = new char[R][C];
        
        for(int row = 0; row < R; row++){
            for(int col = 0; col < C; col++){
                grid[row][col] = sc.next().charAt(0);
            }
        }
        
        boolean[][] visited = new boolean[R][C];
        
        for(int row = 0; row < R; row++){
            for(int col = 0; col < C; col++){
                if('C' == grid[row][col]){
                    if(dfs(R,C,row,col,grid,0,visited,"CARROT")){
                        System.out.println("yes");
                        return;
                    }
                }
            }
        }
        
        System.out.println("no");
    }
}

