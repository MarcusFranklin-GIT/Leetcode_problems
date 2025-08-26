
import java.util.*;
public class StringExpansion {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String S=sc.nextLine();
		Queue<Character> str=new LinkedList<>();
		for(int i=0;i<S.length();i++){
		    if((S.charAt(i)<='z' && S.charAt(i)>='a')||(S.charAt(i)<='Z' && S.charAt(i)>='A')){
		        str.add(S.charAt(i));
		    }else if(S.charAt(i)>='0' && S.charAt(i)<='9'){
		        int num=S.charAt(i)-'0';
		        char c=str.poll();
		        for(int j=0;j<num;j++){
		            System.out.print(c);
		        }
		    }
		}

	}
}