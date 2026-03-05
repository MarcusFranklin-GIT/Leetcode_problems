import java.util.*;
public class reverse_between_twoEvens {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		
		int arr[]=new int[N];
		
		for(int i=0;i<N;i++){
		    arr[i]=sc.nextInt();
		}
		int left=-1;
		for(int curr=0;curr<N;curr++){
		    if(arr[curr]%2==0){
		        if(left==-1){
		            left=curr;
		        }else{
		            reverse(left+1,curr-1,arr);
		            left=curr;
		        }
		    }
		}
		for(int num:arr)System.out.print(num+" ");
	}
	private static void reverse(int left,int right,int[]arr){
	    while(left<right){
	        int temp=arr[left];
	        arr[left]=arr[right];
	        arr[right]=temp;
	        left++;
	        right--;
	    }
	}
}