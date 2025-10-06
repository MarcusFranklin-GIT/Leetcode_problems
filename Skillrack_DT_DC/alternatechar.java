import java.util.*;
public class alternatechar {
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        String S1=sc.nextLine();
        String S2=sc.nextLine();
        if(S1.charAt(0) != S2.charAt(1)){
		    String temp = S1;
		    S1 = S2;
		    S2 = temp;
		}
		for(int i = 0; i < S1.length()-1; i+=2){
		    if(S1.charAt(i) != S2.charAt(i+1)){
		        System.out.println("NO");
		        return;
		    }
		}
		System.out.println("YES");

    }
}
