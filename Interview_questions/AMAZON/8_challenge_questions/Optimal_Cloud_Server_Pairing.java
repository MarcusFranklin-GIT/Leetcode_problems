import java.util.*;

public class Optimal_Cloud_Server_Pairing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int []taskLoad = new int[n];

        for(int i=0;i<n;i++){
            taskLoad[i] = sc.nextInt();
        }

        Arrays.sort(taskLoad);

        int ans =0;
        for(int i=n-2 ; i>=0 ; i-=2){
            ans+=taskLoad[i];
        }

        System.out.print(ans);

        sc.close();  
    }
}