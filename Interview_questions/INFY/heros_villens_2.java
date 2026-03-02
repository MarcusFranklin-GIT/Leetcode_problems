import java.util.*;

public class heros_villens_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int H=sc.nextInt();
        int V[]=new int[N];
        for(int i=0;i<N;i++) {
            V[i]=sc.nextInt();
        }
        int Hsum=M*H;
        for(int i=N-1;i>=0;i--){
            Hsum-=V[i];
            if(Hsum<=0){
                System.out.print(i);
                return;
            }
        }
        System.out.print(0);
        sc.close();  
    }
}