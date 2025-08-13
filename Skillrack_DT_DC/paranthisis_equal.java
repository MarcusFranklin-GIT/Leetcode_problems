
import java.util.*;
public class paranthisis_equal {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String S=sc.nextLine();
        int counter=0;
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='(')counter++;
            else counter--;
            
            System.out.print(S.charAt(i));
            if(counter==0)System.out.println(" .");
        }
        sc.close();
	}
}