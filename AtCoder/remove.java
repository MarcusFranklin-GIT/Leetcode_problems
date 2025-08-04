import java.util.*;
public class remove{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int M=sc.nextInt();
    
    ArrayList<Integer> nums=new ArrayList<>();
    for(int i=0;i<N;i++){
      nums.add(sc.nextInt());
    }
    for(int i=0;i<M;i++){
      int R=sc.nextInt();
      if(nums.contains(R)){
        nums.remove(Integer.valueOf(R));
      }
    }
    
    while(!nums.isEmpty()){
      System.out.print(nums.remove(0));
    }
  }
}