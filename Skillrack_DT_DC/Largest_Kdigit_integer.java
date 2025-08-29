
import java.util.*;
public class Largest_Kdigit_integer {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String N=sc.nextLine();
		int K=sc.nextInt();
		int max=0;
		for(int i=0;i<=N.length()-K;i++){
		    max=Math.max(max,Integer.parseInt(N.substring(i,i+K)));
		}
		System.out.print(max);

	}
}