
import java.util.*;
public class countingRooms{
    public static int diff[][]={{1,0},{0,1},{-1,0},{0,-1}};
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int R=sc.nextInt();
        int C=sc.nextInt();
        sc.nextLine();
        char grid[][]=new char[R][C];
        for(int i=0;i<R;i++){
            String str=sc.next();
            for(int j=0;j<C;j++){
                grid[i][j]=str.charAt(j);
            }
        }
        int count=0;
        for(int row=0;row<R;row++){
            for(int col=0;col<C;col++){
                if(grid[row][col]=='.'){
                    count++;
                    changewall(grid,row,col,R,C);
                }
            }
        }
        System.out.println(count);
    }
    public static void changewall(char[][]grid,int row,int col,int R,int C){
        if(row<0 || row>=R || col>=C || col<0)return;
        if(grid[row][col]=='.'){
            grid[row][col]='#';
            for(int dir[]:diff){
                int adjR=row+dir[0];
                int adjC=col+dir[1];
                changewall(grid,adjR,adjC,R,C);
            }
        }
    }
} 