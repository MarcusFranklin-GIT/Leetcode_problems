import java.util.*;
public class star_and_hyphen {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		sc.close();
		for(int ind=1;ind<=N;ind++){
		    if(ind==1){
		        for(int i=1;i<N;i++)System.out.print("-");
		        for(int i=1;i<=N;i++)System.out.print("*");
		    }else if(ind!=N){
		        for(int i=0;i<N-ind;i++)System.out.print("-");
		        System.out.print("*");
		        for(int i=0;i<N-2;i++)System.out.print("-");
		        System.out.print("*");
		    }else{
		        for(int i=0;i<N;i++)System.out.print("*");
		    }
		    System.out.println();
		}

	}
}