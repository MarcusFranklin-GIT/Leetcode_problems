import java.util.*;
public class Range{
    public static void main(String argv[]){
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int q=sc.nextInt();

        long presum[]=new long[len+1];
        presum[1]=sc.nextLong();
        for(int i=2;i<=len;i++){
            presum[i]=presum[i-1]+sc.nextInt();
        }
        for(int i=0;i<q;i++){
            int start=sc.nextInt();
            int end=sc.nextInt();
            System.out.println(presum[end]-presum[start-1]);
        }
    }   

}
