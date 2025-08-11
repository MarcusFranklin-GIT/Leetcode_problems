import java.util.*;
public class findball {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int pos=sc.nextInt();
		int arr[]={1,2,3};
		for(int i=0;i<N;i++){
		    int X=sc.nextInt();
		    int Y=sc.nextInt();
		    int temp=arr[X-1];
		    arr[X-1]=arr[Y-1];
		    arr[Y-1]=temp;
		}
		for(int i=0;i<3;i++){
		    if(arr[i]==pos){
		        System.out.print(i+1);
		    }
		}

	}
}