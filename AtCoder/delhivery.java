
import java.util.*;
public class delhivery{
  public static void main(String [] args){
     Scanner sc=new Scanner(System.in);
     int N=sc.nextInt();
     String []S=new String[N];
     for(int i=0;i<N;i++){
         S[i]=sc.next();
     }
     int n=sc.nextInt();
     String s=sc.next();
     if(S[n-1].equals(s)){
         System.out.println("Yes");
     }else{
         System.out.println("No");
     }
  }
}