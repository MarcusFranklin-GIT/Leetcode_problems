import java.util.*;
public class StringBuilderProb {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String S=sc.nextLine();
		String B=sc.nextLine();
		StringBuilder SB=new StringBuilder(S);
		int j=0;
		for(int i=0;i<B.length();i++){
		    if(B.charAt(i)=='1'){
		        if(SB.charAt(i-j)<='Z' && SB.charAt(i-j)>='A'){
		            int val=SB.charAt(i-j)-'A';
		            SB.setCharAt(i-j,(char)('a'+val));
		        }else if(SB.charAt(i-j)>='a' && SB.charAt(i-j)<='z'){
		            int val=SB.charAt(i-j)-'a';
		            SB.setCharAt(i-j,(char)('A'+val));
		        }else{
		            SB.deleteCharAt(i-j);
		            j++;
		        }
		    }
		}
		System.out.print(SB);
        sc.close();
	}
}