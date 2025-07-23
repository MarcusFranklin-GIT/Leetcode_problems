
import java.util.Scanner;

public class num_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 0;
        for (int i = 1; i <=n; i++) {
            if(i%2==0){
                for(int j=n*i;j>n*(i-1);j--){
                    System.out.print(j + " ");
                }
            }else{
                for(int j=(n*(i-1))+1;j<=n*i;j++){
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
