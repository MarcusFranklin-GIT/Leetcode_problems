import java.util.*;
public class blackboard {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            for(int i = 0; i < n; i++){
                int num = sc.nextInt();
                if(num%4 == 0){
                    System.out.println("bob");
                }
                else{
                    System.out.println("alice");
                }
            }
        }
    }
}