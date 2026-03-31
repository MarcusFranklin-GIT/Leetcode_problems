import java.util.*;
public class sort_by_weight {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        List<Element> list = new ArrayList<>();
        
        for(int i = 0; i < N; i++){
            int val = sc.nextInt();
            
            list.add(new Element(val ,getWeight(val)));
        }
        
        Collections.sort(list ,(a ,b) -> (a.weight == b.weight) ? b.val - a.val : b.weight - a.weight);
        
        for(int i = 0; i < N; i++){
            System.out.println(list.get(i).val);
        }
	}
	
	private static int getWeight(int val){
	    int weight = 0;
	    
	    if(isPerfect(val)) weight += 5;
	    
	    if(val % 4 == 0 && val % 6 == 0) weight += 4;
	    
	    if(val % 2 == 0) weight += 3;
	    
	    return weight;
	}
	
	private static boolean isPerfect(int val){
	    int sqrt = (int)Math.sqrt(val);
	    
	    return sqrt * sqrt == val;
	}
}

class Element{
    int val;
    int weight;
    Element(int val ,int weight){
        this.val = val;
        this.weight = weight;
    }
}