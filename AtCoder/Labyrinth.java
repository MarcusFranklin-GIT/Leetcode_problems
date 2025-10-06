import java.util.Scanner;

public class Labyrinth {
    public static int diff[]={0,-1,0,1,0};
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int R=sc.nextInt();
        int C=sc.nextInt();
        sc.nextLine();
        int startR=0,startC=0;
        char grid[][]=new char[R][C];
        for(int i=0;i<R;i++){
            String str=sc.next();
            for(int j=0;j<C;j++){
                grid[i][j]=str.charAt(j);
                if(grid[i][j]=='A'){
                    startR=i;
                    startC=j;
                }
            }
        }
        
    }
}
