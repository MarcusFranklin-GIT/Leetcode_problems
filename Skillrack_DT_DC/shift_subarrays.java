import java.util.*;
public class shift_subarrays {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++){
		    arr[i]=sc.nextInt();
		}
		int Q=sc.nextInt();
		while(Q-->0){
		    int x=sc.nextInt();
		    x--;
		    int y=sc.nextInt();
		    y--;
		    String C=sc.next();
		    
		    if(C.equals("L")){
		        int temp=arr[x];
		        for(int i=x;i<y;i++){
		            arr[i]=arr[i+1];    
		        }
		        arr[y]=temp;
		    }else if(C.equals("R")){
		        int temp=arr[y];
		        for(int i=y;i>x;i--){
		            arr[i]=arr[i-1];
		        }
		        arr[x]=temp;
		    }
		    
		    for(int i=0;i<N;i++){
		        System.out.print(arr[i]+" ");
		    }
		    System.out.println();
		}

	}
}