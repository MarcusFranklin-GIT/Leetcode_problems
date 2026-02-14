package Leetcode.Medium;
public class Surrounded_Regions_130 {
    int diff[][]={{0,1},{0,-1},{1,0},{-1,0}};
    public void solve(char[][] board) {
       int R=board.length;
       int C=board[0].length;
        for(int row=0;row<R;row++){
            if(board[row][0]=='O')helper(R,C,row,0,board);
            if(board[row][C-1]=='O')helper(R,C,row,C-1,board);
        }
        for(int col=0;col<C;col++){
            if(board[0][col]=='O')helper(R,C,0,col,board);
            if(board[R-1][col]=='O')helper(R,C,R-1,col,board);
        }



       for(int row=0;row<R;row++){
        for(int col=0;col<C;col++){
            if(board[row][col]=='O')board[row][col]='X';
            if(board[row][col]=='a')board[row][col]='O';
            
        }
       }
       return;
    }
    public void helper(int R,int C,int row,int col,char[][] board){
        if(row<R && col<C && row>=0 && col>=0 && board[row][col]=='O'){
            board[row][col]='a';
            for(int i=0;i<4;i++){
                int curR=row+diff[i][0];
                int curC=col+diff[i][1];
                helper(R,C,curR,curC,board);
            }
        }
    }
}