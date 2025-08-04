
import java.util.ArrayList;
import java.util.List;

public class frank{
    public static void main(String[] args){
        int[] target = {1,3};
        List<String> res = new ArrayList<>();
        int k = 1, i = 0;
        int n1 = target.length;
        int push = 0;
        while(push != n1){
            if(target[i] == k){
                res.add("Push");
                push++;
                i++;   
            }
            else{
                res.add("Push");
                res.add("Pop");
            }
            System.out.println(res);
            k++;
       } 
       System.out.println(res);
    }
}