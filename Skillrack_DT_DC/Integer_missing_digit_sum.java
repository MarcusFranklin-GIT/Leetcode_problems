import java.util.*;
public class Integer_missing_digit_sum {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		long sum=0l;
		for(int i=0;i<N;i++){
		    int num=sc.nextInt();
		    int fre[]=new int[10];
		    while(num>0){
		        fre[num%10]=1;
		        num/=10;
		    }
		    int temp=0;
		    for(int ind=9;ind>=0;ind--){
		        if(fre[ind]!=1){
		            temp=(temp*10)+ind;
		        }
		    }
		    sum+=(long)temp;
		}
        System.out.print(sum);
	}
}

// input= 4
// 4647 67865 150 321879
// output =20679391
// 9853210 + 943210 + 9876432 + 6540 = 20679391