import java.util.Scanner;

public class sparcetable {

    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int R=logval(N);
        int arr[][]=new int[R][N];
        
    }
    public static int logval(int N){
        int ln=0;
        for(ln=0;(1<<ln)<N;ln++);
        return ln;
    }
}
