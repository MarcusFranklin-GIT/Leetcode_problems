package Leetcode.Hard;

import java.util.*;
class SudokuSolver{
    public static void main(String[] args) {
        char[][] board = {
            {'2', '.', '.', '.', '3', '7', '.', '.', '8'},
            {'8', '.', '6', '.', '.', '2', '.', '7', '.'},
            {'4', '.', '.', '.', '8', '.', '.', '6', '.'},
            {'.', '.', '4', '.', '.', '9', '.', '.', '1'},
            {'5', '.', '.', '.', '.', '.', '6', '.', '7'},
            {'.', '6', '.', '5', '7', '.', '.', '.', '4'},
            {'.', '3', '.', '2', '5', '.', '1', '.', '.'},
            {'1', '8', '5', '4', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '6', '5', '8', '.'}
        };
        solution solver = new solution();
        solver.solveSudoku(board);
        for (char[] row : board) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println("today 31/8/2025 i solved Sudoku solver");
    }
}
class solution {
    public void solveSudoku(char[][] board) {
        int R = board.length, Size = board.length;
        int C = board[0].length;
        int SMsize = (int) Math.sqrt(Size);

        int Row[] = new int[R];
        int Col[] = new int[C];
        int SMint[] = new int[Size];

        for (int row = 0; row < R; row++) {
            for (int col = 0; col < C; col++) {
                if (board[row][col] != '.') {
                    int val = (1 << (board[row][col] - '0'));
                    Row[row] |= val;
                    Col[col] |= val;
                    SMint[getSM(row, col, SMsize)] |= val;
                }
            }
        }
        solve(R, C, SMsize, board, Row, Col, SMint);
    }

    public static int getSM(int row, int col, int size) {
        return size * (row / size) + (col / size);
    }

    public static Cell GetUnfilled(int R, int C, char[][] board) {
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (board[i][j] == '.') {
                    return new Cell(i, j);
                }
            }
        }
        return null;
    }

    public static boolean solve(int R, int C, int SMsize, char[][] board, int[] Row, int[] Col, int[] SMint) {
        Cell tofill = GetUnfilled(R, C, board);
        if (tofill == null)
            return true;
        for(int dig=1;dig<=9;dig++){
            int val=1<<dig;
            if((Row[tofill.row]&val)==0 && (Col[tofill.col]&val)==0 && (SMint[getSM(tofill.row,tofill.col,SMsize)]&val)==0){
                board[tofill.row][tofill.col]=(char)('0'+dig);
                Row[tofill.row]|=val;
                Col[tofill.col]|=val;
                SMint[getSM(tofill.row,tofill.col,SMsize)]|=val;
                boolean solved=solve(R, C, SMsize, board, Row, Col, SMint);
                if(solved){
                    return true;
                }
                board[tofill.row][tofill.col]='.';
                Row[tofill.row]^=val;
                Col[tofill.col]^=val;
                SMint[getSM(tofill.row,tofill.col,SMsize)]^=val;
            }
        }
        return false;
    }
}

class Cell {
    int row, col;
    Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }
}