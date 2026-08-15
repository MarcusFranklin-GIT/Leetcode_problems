import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Maximise_protected_Inventory {
    public static int secureMaximumDeliveries(int shipments[], int k){
        int max=0;
        for(int ship : shipments){
            max = Math.max(max,ship);
        }

        int result = 0;

        for(int ind = 1 ; ind <=max ; ind++ ){
            result =Math.max(result,find(shipments,ind,k));
        }

        return result;
    }

    public static int find(int[] shipments,int treshold,int k){
        int count= 0;
        List<Integer> safe = new ArrayList<>();

        for(int ship : shipments){
            count += ship / treshold;
            safe.add( ship % treshold);
        }

        int needed = count - (k/2);
        if(needed<0)return -1;

        int addCount = Math.min(needed, k / 2);
        while(addCount-- > 0) safe.add(treshold);

        Collections.sort(safe,Collections.reverseOrder());

        int res=0;
        for(int i=0; i<((k+1)/2) && i<safe.size() ; i++){
            res+=safe.get(i);
        }   
        return res;
    }
}
