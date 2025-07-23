import java.util.Scanner;

public class find_carry {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        int Y=sc.nextInt();
        while(X>0 || Y>0 ){
            int carry=0;
            if(X%10 + Y%10 + carry >= 10){
                carry = 1;
        }else{
            carry = 0;
        }
        System.out.print(carry+" ");
        X/=10;
        Y/=10;
    }
}
}
