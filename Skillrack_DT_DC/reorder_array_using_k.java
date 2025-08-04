import java.util.*;
public class reorder_array_using_k {

    public static void main(String[] args) {
		try (//Your Code Here
        Scanner sc = new Scanner(System.in)) {
            int N=sc.nextInt();
            int arr[]=new int[N];
            for(int i=0;i<N;i++)arr[i]=sc.nextInt();
            int k=sc.nextInt();
            int count=0;
            for(int i=1;i<N;i++){
                if(arr[i-1]>=arr[i]){
                    int num=1+(arr[i-1]-arr[i])/k;
                    arr[i]+=num*k;
                    count+=num;
                }
            }
            System.out.print(count+"..");
        }
	}
}