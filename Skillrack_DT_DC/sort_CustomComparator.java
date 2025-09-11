
import java.util.*;
public class sort_CustomComparator {
    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		sc.nextLine();
		List<int[]> question=new ArrayList<>();
		
		for(int i=0;i<N;i++){
		    String[] parts=sc.nextLine().split("\\.");
		    int x=Integer.parseInt(parts[0]);
		    int y=Integer.parseInt(parts[1]);
		    int z=Integer.parseInt(parts[2]);
		    question.add(new int[]{x,y,z});
		}
		Collections.sort(question,(a,b)->{
		    if(a[0]!=b[0])return a[0]-b[0];
		    else if(a[1]!=b[1])return a[1]-b[1];
		    else return a[2]-b[2];
		    
		});
        for(int q[]:question){
            System.out.println(q[0]+"."+q[1]+"."+q[2]);
        }
	}
}

//costum comparator to sort the arraylist of int arrays
//first sort by first element if equal then sort by second element if equal then sort by third element
//use lambda function to define the comparator
//use Collections.sort() method to sort the arraylist