
import java.util.*;
public class lose_Jars_With_Lids {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		ArrayList<Integer> arr =new ArrayList<>();
		int count=0;
		for(int i=0;i<N;i++){
		   int num=sc.nextInt();
		   if(num%2==1 &&arr.contains(num+1))count++;
		   else if(num%2==0 &&arr.contains(num-1))count++;
		   else{
		       arr.add(num);
		   }
		   
		}
		System.out.print(count);

	}
}