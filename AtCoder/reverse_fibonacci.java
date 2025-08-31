
import java.util.*;
public class reverse_fibonacci{
  public static void main(String [] args){
     Scanner sc=new Scanner(System.in);
     long X=sc.nextLong();
     long Y=sc.nextLong();
     long ans=0;

     for(int i=3;i<=10;i++){
        ans=reverse(X+Y);
        X=Y;
        Y=ans;
     }
     System.out.print(ans);
     
  }
  public static long reverse(long n){
     long rev=0;
     while(n>0){
         rev=rev*10+n%10;
         n/=10;
     }
     return rev;
  }
}