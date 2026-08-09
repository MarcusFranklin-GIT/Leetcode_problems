
import java.util.*;
class Find_the_Running_Median {

    /*
     * Complete the 'runningMedian' function below.
     *
     * The function is expected to return a DOUBLE_ARRAY.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static List<Double> runningMedian(List<Integer> a) {
    // Write your code here
    
    //this is the result List
    List<Double> result = new ArrayList<>();
    
    //this stores as decending orger (first half of the array)
    PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
    
    //this PQ stores the second hald (sorted in ascending)
    PriorityQueue<Integer> minheap = new PriorityQueue<>();
    
    for(int num : a){
        maxheap.add(num);
        
        //put into correct list
        if(!maxheap.isEmpty() && !minheap.isEmpty() && maxheap.peek()>minheap.peek()){
            int mintop = minheap.poll();
            int maxtop = maxheap.poll();
            
            maxheap.offer(mintop);
            minheap.offer(maxtop);
        }
        
        //resize if both became unbalenced 
        if (maxheap.size() - minheap.size() > 1) {
            minheap.offer(maxheap.poll());
        } else if (minheap.size() > maxheap.size()) {
            maxheap.offer(minheap.poll());
        }
        
        double median;
        
        //check if the two list are in equal size 
        // if equal sum two tops and calculate the average
        // else take the top of the maxheap as median 
        if(minheap.size() == maxheap.size()){
            median = (minheap.peek()+maxheap.peek())/2.0;
        }else{
            median = maxheap.peek();
        }
        result.add(median);
    }
    return result;
    }
}