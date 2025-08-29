
import java.util.*;
public class Alphebet_weight_sum {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String Str=sc.nextLine();
		String S=Str.toLowerCase();
		int []fibo=new int[26];
		fibo[0]=0;
		fibo[1]=1;
		for(int i=2;i<26;i++){
		    fibo[i]=fibo[i-1]+fibo[i-2];
		}
		int sum=0;
		
		for(int i=0;i<S.length();i++){
		    sum+=fibo[S.charAt(i)-'a'];
		}
		System.out.print(sum);

	}
}