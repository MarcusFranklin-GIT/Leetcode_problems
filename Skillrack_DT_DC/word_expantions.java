
import java.util.*;
public class word_expantions {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String S1=sc.nextLine();
		String S2=sc.nextLine();
		int len1=S1.length();
		int len2=S2.length();
		if(len2%len1==0){
		    int len=len2/len1;
		    for(int i=0;i<len1;i++){
		        for(int j=i*len;j<(i*len)+len;j++){
		            if(S1.charAt(i)!=S2.charAt(j)){
		                System.out.print("No");
                        return;
		            }
		        }
		    }
		    System.out.print("Yes");
		}else{
		    System.out.print("No");
		}
	}
}