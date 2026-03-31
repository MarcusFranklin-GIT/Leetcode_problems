import java.util.*;
public class pattern {

    public static void main(String[] args) {
        //Your Code Here
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();

        int N=str.length();
        
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(i == j || j == N- i - 1) System.out.print(str.charAt(i));
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}