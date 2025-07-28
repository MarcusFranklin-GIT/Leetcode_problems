import java.util.*;

public class Recycling_Center{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            long C=sc.nextLong();
            int cost=0;
            Long[] arr = new Long[N];
            for(int i=0;i<N;i++) {
                arr[i]=sc.nextLong();
                if(arr[i] > C) {
                    cost++;
                }
            }
            Arrays.sort(arr, Collections.reverseOrder());
            for(int i=cost+1;i<N;i++){
                arr[i]*=2;
            }
            for(int i=cost+1;i<N;i++){
                if(C<arr[i]){
                    cost++;
                    System.out.print(arr[i]+" ");
                }else{
                    for(int j=i+1;j<N;j++){
                        arr[j]*=2;
                    }

                }
            }
            System.out.println(cost);
           
        }
        
         sc.close();
    }
}
