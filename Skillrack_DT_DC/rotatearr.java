import java.util.*;
public class rotatearr {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++){
		    arr[i]=sc.nextInt();
		}
		int K=sc.nextInt();
		
		arr=rotate(arr,1,N-1-K);
		arr=rotate(arr,N-K,N-1);
		arr=rotate(arr,1,N-1);
		
		for(int i=0;i<N;i++){
		    System.out.print(arr[i]+" ");
		}

	}
	public static int[] rotate(int[] arr,int start,int end){
	    while(start<end){
	        int temp=arr[start];
	        arr[start]=arr[end];
	        arr[end]=temp;
	        start++;
	        end--;
	    }
	    return arr;
	} 
}

// Input:           the program rotates the array by clockwise direction by leaving the first element in its position
// 5
// 1 2 3 4 5
// 2
// Output:
// 1 4 5 2 3  