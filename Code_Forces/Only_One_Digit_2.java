
import java.util.*;

public class Only_One_Digit_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int num=sc.nextInt();
            int high=Integer.MAX_VALUE;
            while(num>0)
            {
               if(num%10<high){
                   high=num%10;
               }
                num/=10;
            }
            System.out.println(high);
        }
        sc.close();
    }
}