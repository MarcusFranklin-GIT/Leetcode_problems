import java.util.*;

class MagicalWand {
    static int[][] Dirr ={{0,1},{1,0},{-1,0},{0,-1}};
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int R=sc.nextInt();
        int C=sc.nextInt();
        char[][] mat=new char[R][C];
        boolean visited[][]=new boolean[R][C];
        int startR=-1,startC=-1;    
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                mat[i][j]=sc.next().charAt(0);
                if(mat[i][j]=='B'){
                    startR = i;
                    startC = j;
                }
            }
        }
        int W=sc.nextInt();

        visited[startR][startC] = true;

        if (canReach(mat, R, C, W, visited, startR, startC))
            System.out.println("yes");
        else
            System.out.println("no");
    }

    public static boolean canReach(char mat[][],int R,int C,int W,boolean visited[][],int row,int col){
        if(W<0)return false;
        if(mat[row][col]=='W'){
            return true;
        }
        for(int dir[]:Dirr){
            int adjR = dir[0]+row;
            int adjC = dir[1]+col;
            if(adjR>=0 && adjR<R && adjC>=0 && adjC<C && !visited[adjR][adjC]){
                visited[adjR][adjC]=true;
                int wand = W;
                if (mat[adjR][adjC]<= '9' && mat[adjR][adjC] >= '0') {
                    wand -= (mat[adjR][adjC] - '0');
                }

                if (canReach(mat, R, C, wand, visited, adjR, adjC)) return true;
                visited[adjR][adjC] = false;
            }
        }
        return false;
    }
}







// Try this program -> 
// In a grid, a boy B has N power points. He must reach the magical wand 'W'. 
// During his course of reaching the magical band, his power points will be deducted if a cell has a positive integer value. 
// Print if the boy can reach the magical wand with the N power points. The boy can travel to left, right, top or bottom cells.
//  He must visit each cell only once during his course. If the power points becomes negative, he cannot travel further.

// Example Input/Output 1:
// Input:
// 5 6
// 0 B 1 1 1 1
// 1 1 0 0 1 0
// 1 0 1 0 0 0
// 0 1 0 1 0 4
// 0 1 1 1 0 W
// 2

// Output:
// yes

// Example Input/Output 2:
// Input:
// 5 6
// 0 B 1 1 1 1
// 1 1 0 0 1 0
// 1 0 1 0 0 0
// 0 1 0 1 0 4
// 0 1 1 1 0 W
// 1

// Output:
// no