
import java.util.*;
public class sum_last_occurance_ofOneValue {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++)arr[i]=sc.nextInt();
        long sum=0;
        for(int num:arr)sum+=(num&-num);
        System.out.print(sum);
	}
}

// input: 5
//        12 10 8 15 22

// output: num = 12 → binary ... 00001100 , num = 10 → ... 00001010 , num = 8 → ... 00001000 , num = 15 → ... 00001111 , num = 22 → ... 00010110 ,
// take last 1 value from each binary representation
// 12 → 4, 10 → 2, 8 → 8, 15 → 1, 22 → 2 ,total_sum= 17