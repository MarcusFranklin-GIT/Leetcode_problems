import java.util.Scanner;

public class AlternatingSeries {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();

            if(N==2){
                System.out.println("-1 2");
            }else{
                int num=3;
                for(int i=0;i<N;i++){
                    if(i%2==0){
                        System.out.print("-1 ");
                    }else{
                        System.out.print(num++ + " ");
                    }
                }
            }
        }
    }
}
