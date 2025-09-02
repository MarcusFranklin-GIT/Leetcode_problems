import java.util.Scanner;

public class String_multiple {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String S=sc.nextLine();
       int i=0;
       while(i<S.length()){
            StringBuilder sb=new StringBuilder();
           while(S.charAt(i)>='a' && S.charAt(i)<='z'){
               sb.append(S.charAt(i));
               i++;
           }
           int num=0;
           while(i<S.length() && (S.charAt(i)<='9' && S.charAt(i)>='0')){
               num=num*10+(S.charAt(i)-'0');
               i++;
           }
           for(int j=0;j<num;j++){
               System.out.print(sb);
           }    
       }
    }
}