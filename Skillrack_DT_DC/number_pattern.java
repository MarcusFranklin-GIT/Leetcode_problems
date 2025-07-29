import java.util.*;
public class number_pattern {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		sc.close();
		if(N<2){
		    if(N==1){
		        System.out.println("0");
		        return;
		    }else{
		        System.out.println("1");
		        return;
		    }
		}
		int S[]=new int[N];
		S[0]=0;
		S[1]=1;
		for(int k=2;k<N;k++){
		    S[k]=S[k-1]+(2*S[k-2])+3;
		}
		System.out.print(S[N-1]);
		
	}
} 
