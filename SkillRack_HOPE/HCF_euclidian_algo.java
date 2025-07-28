import java.util.Scanner;

public class HCF_euclidian_algo {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("HCF of "+a+" and "+b+" is: "+ gcd(a,b));

    }

    public static int gcd(int a,int b){
        return (b==0)?a:gcd(b,a%b);
    }
    
}
