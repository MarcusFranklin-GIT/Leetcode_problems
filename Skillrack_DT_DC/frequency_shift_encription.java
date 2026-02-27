import java.util.*;
public class frequency_shift_encription {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		
		String S=sc.nextLine();
		HashMap<Character,Integer> map=new HashMap<>();
		
		for(int i=0;i<S.length();i++){
		    char ch=S.charAt(i);
		    int count=map.getOrDefault(ch,0);
		    
		    System.out.print((char)((((ch-'a')+count)%26)+'a'));
		    map.put(ch,map.getOrDefault(ch,0)+1);
		}
		
	}
}