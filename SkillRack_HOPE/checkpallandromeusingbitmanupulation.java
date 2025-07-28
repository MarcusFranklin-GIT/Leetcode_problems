import java.util.Scanner;
public class checkpallandromeusingbitmanupulation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int num=0;
        for(int i=0;i<str.length();i++){
            num^=(1<<(str.charAt(i)-'a'));
        }
        if(num==0|| (num & (num-1))==0){
            System.out.println("palindrome can be formed when rearranged");
        } else {
            System.out.println("NO it is not a palindrome");
        }
        sc.close();
    }
}
