import java.util.*;
class equal_stack {
    
    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        // Write your code here
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        int prefix=0;
        for(int i=h1.size()-1;i>=0;i--){
            prefix+=h1.get(i);
            set1.add(prefix);
        }
        prefix =0;
        for(int i=h2.size()-1;i>=0;i--){
            prefix+=h2.get(i);
            set2.add(prefix);
        }
        prefix = 0;
        
        int max =0;
        for(int i=h3.size()-1;i>=0;i--){
            prefix+=h3.get(i);
            
            if(set1.contains(prefix) && set2.contains(prefix)){
                max= prefix;
            }
        }
        return max;
    }
}
