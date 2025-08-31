
class valid_sudoku_36{
    public boolean isValidSudoku(char[][] board) {
        int size=board.length;
        int R=board.length, C=board[0].length;
        int Row[]=new int[R];
        int Col[]=new int[C];
        int SMind[]=new int[size]; //no of submatrix 
        int SMsize=(int) Math.sqrt(size); //submatrix size

        for(int row=0;row<R;row++){
            for(int col=0;col<C;col++){
                if(board[row][col]!='.'){
                    int val=1<<(board[row][col]-'0');
                    if((val & Row[row])!=0 || (val & Col[col])!=0 || (val & SMind[getsub(row,col,SMsize)])!=0){
                        return false;
                    }
                    Row[row]|=val;
                    Col[col]|=val;
                    SMind[getsub(row,col,SMsize)]|=val;
                }
            }
        }
        return true;
    }
    public static int getsub(int r,int c,int size){
        return size*(r/size)+(c/size);
    }
}