import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Chocolate {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<N;i++){
            int x=sc.nextInt();
            pq.add(x);
        }
        int days=sc.nextInt();
        while(pq.peek()!=1 && days>0){
            int weight=pq.poll();
            
            pq.add((weight+1)/2);
            days--;
        }

        if(pq.peek()==1){
            System.out.println(pq.size());
        }else{
            long res=0;
            while (pq.size() > 0) {
                res += pq.poll(); 
            }
            System.out.println(res);
        }


        sc.close();
    }
    
}
