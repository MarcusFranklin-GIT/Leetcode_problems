import java.util.*;
public class swapPosition {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int Q=sc.nextInt();
		int queries[][]=new int[Q][2];
		
		for(int i=0;i<Q;i++){
		    queries[i][0]=sc.nextInt();
		    queries[i][1]=sc.nextInt();
		}
		
		int num=N,size=0;
		int rev=0;
		while(num>0){
		    rev=(rev*10)+num%10;
		    num/=10;
		    size++;
		}
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
		    arr[i]=rev%10;
		    rev/=10;
		}
		sc.close();
		for(int i=0;i<Q;i++){
		    int temp=arr[queries[i][0]-1];
		    arr[queries[i][0]-1]=arr[queries[i][1]-1];
		    arr[queries[i][1]-1]=temp;
		}
		int Final=0;
		for(int i=0;i<size;i++){
		    Final=(Final*10)+arr[i];
		}
        if(Final==N){
            System.out.print("YES");
        }else {
            System.out.print(Final*2);
        }
	}
}