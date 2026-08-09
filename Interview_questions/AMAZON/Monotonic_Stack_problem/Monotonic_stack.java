import java.util.*;
public class Monotonic_stack {
    /*
     * Complete the 'largestRectangle' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts INTEGER_ARRAY h as parameter.
     */
    public static long largestRectangle(List<Integer> h) {
    // Write your code here
    
        Stack<Integer> mono = new Stack<>();
        
        int len = h.size();
        long max_area =0;
        
        for(int i=0;i<=len;i++){
            
            while(!mono.isEmpty() && (i==len || h.get(mono.peek())>h.get(i))){
                
                int height = h.get(mono.pop());
                int width =0;
                if(mono.isEmpty()){
                    width = i;
                }else{
                    width = i-mono.peek()-1;
                }
                max_area = Math.max(max_area,height*width);
            }
            mono.push(i);
        }   
    return max_area;
    }
}