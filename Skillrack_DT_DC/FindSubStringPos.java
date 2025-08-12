import java.util.*;
public class FindSubStringPos {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		
		String S=sc.nextLine();
		int len=S.length();
		int templen=len;
		while(templen>0){
		    String sub=sc.nextLine();
		    int sublen=sub.length();
		    for(int i=0;i<len;i++){
		        if(S.substring(i,i+sublen).equals(sub)){
		            System.out.println((i/sublen)+1);
		            templen-=sublen;
		            break;
		        }
		    }
		}
		sc.close();
	}
}