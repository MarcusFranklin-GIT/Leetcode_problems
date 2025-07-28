
import java.util.*;
class XO{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int L=sc.nextInt();
    int R=sc.nextInt();
    sc.nextInt();
    String S=sc.nextLine();
    for(int i=L-1;i<R;i++){
      if(S.charAt(i)=='x'){
        System.out.print("No");
        return;
      }
    }
    System.out.print("Yes");
  }
}