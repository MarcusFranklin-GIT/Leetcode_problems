package ZOHO_Practice;
import java.util.*;
public class Digits_count {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);

		int Number = sc.nextInt();
		
		int start = 1;
		int ind =1 ;
		int count = 0;
		
		while(Number>= start*10){
		    
			int elements =(start*10)-start;

			count += elements*ind;
		    
			start*=10;
		    ind++;
		}
		
		count += (Number-start+1)*ind;
		
		System.out.print(count+".");
		

	}
}