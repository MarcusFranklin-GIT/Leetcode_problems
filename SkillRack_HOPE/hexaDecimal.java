import java.util.*;
public class hexaDecimal {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        System.out.print("Number: ");
        converthexa(N);
    }

    private static void converthexa(int N){
        if(N<16){
            System.out.print((N<10) ? (char)(N%16 + '0'): (char)((N%16) - 10 + 'A'));
            return;
        }else{
            converthexa(N/16);
            System.out.print(((N%16)<10) ? (char)(N%16 + '0'): (char)((N%16) - 10 + 'A'));
                }

    }
}
