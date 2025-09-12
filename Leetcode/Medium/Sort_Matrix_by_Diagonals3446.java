package Leetcode.Medium;


import java.util.*;

class Sort_Matrix_by_Diagonals3446 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int grid[][]=new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                grid[i][j]=sc.nextInt();
            }
        }
        Sort_Matrix_by_Diagonals3446 obj=new Sort_Matrix_by_Diagonals3446();
        int ans[][]=obj.sortMatrix(grid);
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }

    
    public int[][] sortMatrix(int[][] grid) {
        int N=grid.length;
        for(int col=1;col<N;col++){
            asending(0,col,N,grid);
        }
        for(int row=0;row<N;row++){
            decending(row,0,N,grid);
        }
        return grid;
    }
    public static void asending(int row,int col,int N,int grid[][]){
        PriorityQueue<Integer> PQ=new PriorityQueue<>();
        for(int r=row,c=col;r<N && c<N;r++,c++){
            PQ.add(grid[r][c]);
        }
        for(int r=row,c=col;r<N && c<N;r++,c++){
            grid[r][c]=PQ.poll();
        }
    }
    public static void decending(int row,int col,int N,int [][]grid){
        PriorityQueue<Integer> PQ=new PriorityQueue<>(Collections.reverseOrder());
        for(int r=row,c=col;r<N && c<N;r++,c++){
            PQ.add(grid[r][c]);
        }
        for(int r=row,c=col;r<N && c<N;r++,c++){
            grid[r][c]=PQ.poll();
        }
    }
}