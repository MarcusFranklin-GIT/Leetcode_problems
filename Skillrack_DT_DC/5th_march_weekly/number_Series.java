import java.util.*;
public class number_Series {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		
		int pos=(N-1)/3;
		int series=(N-1)%3;
		
		if(series==0){
		    System.out.print(2*pos);
		}else if(series==1){
		    System.out.print(3*pos);
		}else{
		    System.out.print((int)Math.pow(2,pos));
		}

	}
}