public class Word_Search_79 {
    private int directions[][]={{0,1},{0,-1},{1,0},{-1,0}};

    public boolean exist(char[][] board, String word) {
        int R=board.length;
        int C=board[0].length;
        int visited[][]=new int[R][C];

        for(int row=0;row<R;row++){
            for(int col=0;col<C;col++){
                if(board[row][col]==word.charAt(0)){
                    visited[row][col]=1;
                    if(DFS(board,word,row,col,R,C,0,visited))return true;
                    visited[row][col]=0;
                }
            }
        }
        return false;
    }

    public boolean DFS(char [][]board,String word,int row,int col,int R,int C,int ind,int [][]visited){
        if(ind==word.length()-1)return true;


        for(int []dir:directions){
            int currR=row+dir[0];
            int currC=col+dir[1];
            if(currR<0 || currR>=R || currC<0 || currC>=C || visited[currR][currC]==1)continue;
            if(board[currR][currC]==word.charAt(ind+1)){
                visited[currR][currC]=1;
                if(DFS(board,word,currR,currC,R,C,ind+1,visited))return true;
                visited[currR][currC]=0;
            }
        }
        return false;
    }
}