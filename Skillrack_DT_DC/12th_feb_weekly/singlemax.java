import java.util.*;
public class singlemax {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int count=0;
		int max=0;
		int N=sc.nextInt();
		Queue<Integer> arr=new LinkedList<>();
		for(int i=0;i<N;i++){
		    int num=sc.nextInt();
		    if(num<10){
		        max=Math.max(max,num);
		        count++;
		    }else{
		        arr.add(num);
		    }
		}
		while(!arr.isEmpty()){
		    int num=arr.poll();
		    int element1=num/2;
		    int element2=num-element1;
		    
		    if(element1>9)arr.add(element1);
		    else{
		        max=Math.max(max,element1);
		        count++;
		    }
		    if(element2>9)arr.add(element2);
		    else{
		        max=Math.max(max,element2);
		        count++;
		    }
		}
		System.out.print(max+" "+count+".");
        sc.close();
	}
}