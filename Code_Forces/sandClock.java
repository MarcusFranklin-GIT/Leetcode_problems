import java.util.*;
public class sandClock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Test = sc.nextInt();

        while (Test-- > 0) {
           int S=sc.nextInt();      //sand clock time 
           int K=sc.nextInt();      //time to flip
           int M=sc.nextInt();      //total time 

            int result;
            if(K>M){
                result=Math.max(0,S-M);
            }else{
                if((M/K)%2==0 ||S<K){
                    result=Math.max(0,S-(M%K));
                }else{
                    result=Math.max(0,K-(M%K));
                }
            }
            System.out.println(result);
        }
      }
}