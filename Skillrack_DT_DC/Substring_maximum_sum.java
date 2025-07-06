import java.util.*;
public class Substring_maximum_sum {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String S=sc.nextLine();
		int total=0,sub=0;
		for(int i=0;i<S.length();i++){
		    int val=S.charAt(i)-'0';
		    if((i==0) || val==S.charAt(i-1)-'0'){
		        sub*=10;
		        sub+=val;
		    }else{
		        total+=sub;
		        sub=val;
		    }
		    
		    if(i==S.length()-1){
		        total+=sub;
		    }
		  //  System.out.println(sub+"  "+total);
		    
		}
		System.out.print(total);

	}
}