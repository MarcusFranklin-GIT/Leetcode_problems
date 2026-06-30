package Array;

import java.util.HashSet;
import java.util.Set;

public class Restore_Finishing_Order_3668 {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> set = new HashSet<>();
        for(int num : friends)set.add(num);

        int i=0;
        for(int wins:order){
            if(set.contains(wins)){
                friends[i++]=wins;
            }
        }
        return friends;
    }
}
