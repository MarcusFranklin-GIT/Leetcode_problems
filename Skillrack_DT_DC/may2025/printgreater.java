import java.util.*;
public class printgreater {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int M =sc.nextInt();
		
		for(int i=0;i<N;i++){
		    int num=sc.nextInt();
		    if(num>M){
		        System.out.print(num+" ");
		    }
		}
	}
}