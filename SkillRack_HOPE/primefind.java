import java.util.*;
public class primefind {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        if(checkprime(N))System.out.println("Yes");
        else System.out.println("No");
        boolean arr[]=findprimes(N);
        for(int i=2;i<=N;i++){
            if(!arr[i])System.out.print(i+" ");
        }
    }

    public static boolean[] findprimes(int N){
        boolean arr[]=new boolean[N+1];
        for(int i=2;i*i<=N;i++){
            if(!arr[i]){
                for(int j=i*i;j<=N;j+=i){
                    arr[j]=true; 
                }
            }
        }
        return arr;
    }
    public static boolean checkprime(int N){
        if(N==2||N==3)return true;
        if(N%2==0||N%3==0|| N<2)return false;
        for (int i = 2;i <= Math.sqrt(N);i++) {
            if (N % i == 0 || N % (i + 2) == 0) return false;
        }
        return true;
    }
}
