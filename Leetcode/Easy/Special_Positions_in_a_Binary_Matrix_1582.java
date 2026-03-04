package Leetcode.Easy;
class Special_Positions_in_a_Binary_Matrix_1582 {
    public int numSpecial(int[][] mat) {
        int R=mat.length;
        int C=mat[0].length;

        int count=0;
        int rowC[]=new int[R];
        int colC[]=new int[C];

        for(int row=0;row<R;row++){
            for(int col=0;col<C;col++){
                if(mat[row][col]==1){
                    rowC[row]++;
                    colC[col]++;
                }
            }
        }

        for(int row=0;row<R;row++){
            for(int col=0;col<C;col++){
                if(mat[row][col]==1 && rowC[row]==1 && colC[col]==1)count++;
            }
        }
        return count;
    }
}