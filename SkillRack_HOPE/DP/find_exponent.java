import java.util.Scanner;
public class find_exponent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        int Y=sc.nextInt();
        while(X%Y==0){
            X=X/Y;
        }
        System.out.println(X==1);
    }
}
