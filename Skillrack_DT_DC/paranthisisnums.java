import java.util.Scanner;
public class paranthisisnums {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			String S=sc.nextLine();
			int count=0,sum=0,num=0;
			for(int i=0;i<S.length()-1;i++){
			    if(S.charAt(i)=='('){
			        count++;
			    }else if(S.charAt(i)==')'){
			        count--;
			    }else{
			        if(S.charAt(i+1)=='('|| S.charAt(i+1)==')'){
			            num=(num*10)+S.charAt(i)-'0';
			            sum+=(num*count);
			            num=0;
			        }else{
			            num=(num*10)+S.charAt(i)-'0';
			        }
			    }
			  //  System.out.println(" "+count+" "+sum+" "+num);
			}
		System.out.print(sum);
		sc.close();
	}
}
//this code is to calculate the sum of numbers in a string with parentheses, where the numbers are multiplied by the count of open parentheses before them.
//It reads a string, counts the open parentheses, and calculates the sum based on the numbers
