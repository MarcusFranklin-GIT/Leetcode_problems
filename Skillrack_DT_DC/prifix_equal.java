
import java.util.*;
public class prifix_equal {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
		int o=0,z=0;
		for(int i=0;i<str.length();i++){
		    if(str.charAt(i)=='1')o++;
		    else {
		        z++;
		        if(z>o){
		            System.out.println("No.");
		            return;
		        }
		    }
		}
		if(z==o)System.out.println("Yes");
		else System.out.println("No.");
	}
}