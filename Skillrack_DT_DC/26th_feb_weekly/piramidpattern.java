import java.util.*;
public class piramidpattern {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		
		for(int row=0;row<(N+1)/2;row++){
		    for(int i=0;i<N;i++){
		        if(i<=(N/2)+row && i>=(N/2)-row){
		            System.out.print("*");
		        }else{
		            System.out.print("!");
		        }
		    }
		    System.out.println();
		}
        sc.close();
	}
}