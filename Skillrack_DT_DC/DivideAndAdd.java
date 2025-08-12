
import java.util.*;
public class DivideAndAdd{

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++)arr[i]=sc.nextInt();
		int K=sc.nextInt();
		
		for(int i=0;i<K;i++){
		    for(int j=K;j<N;j++){
		        arr[j]+=arr[j]%arr[i];
		    }
		}
		
		for(int num:arr)System.out.print(num+" ");

	}
}