
import java.util.*;
public class stop_watch {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		if(N%2!=0){
		    System.out.print("-1");
            return;
		}
		int time=0;
		for(int i=0;i<N/2;i++){
		    int n1=sc.nextInt();
		    int n2=sc.nextInt();
		    time+=(n2-n1);
		}
		System.out.print(time+"...");
		sc.close();
	}
}