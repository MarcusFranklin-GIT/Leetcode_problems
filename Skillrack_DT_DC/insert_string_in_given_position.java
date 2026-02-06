
import java.util.*;
public class insert_string_in_given_position {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int X=sc.nextInt();
		int N=sc.nextInt();
		sc.nextLine();
		 
		char str[]=new char[X];
		Arrays.fill(str,'-');
		
		while(N-->0){
		    
		    String S=sc.next();
		    int pos=sc.nextInt();
		    pos--;
		    if(pos+S.length()>X)continue;
		    
		    boolean flag=true;
		    for(int i=pos;i<pos+S.length();i++){
		        if(str[i]!='-'){
		        flag=false;
		        break;
		       }
		    }
		    if(flag){
		      for(int i=0;i<S.length();i++)str[pos+i]=S.charAt(i);
		    }
		}
		System.out.print(new String(str));

	}
}