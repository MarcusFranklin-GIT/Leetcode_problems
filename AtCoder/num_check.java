
import java.util.Scanner;
public class num_check {
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt(),num=0;
    int arr[]=new int[N];
    for(int i=0;i<N;i++){
      arr[i]=sc.nextInt();
    }
    for(int i=1;i<N;i++){
      if(arr[i]!=arr[0]){
        System.out.println("No");
        return;
      }
    }
    System.out.println("Yes");
}
}