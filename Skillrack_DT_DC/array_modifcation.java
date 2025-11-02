
import java.util.*;
public class array_modifcation {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		int res[]=new int[N];
		int op[]=new int[N];
		
		for(int i=0;i<N;i++){
		    arr[i]=sc.nextInt();
		    res[i]=arr[i];
		    op[i]=-1;
		}
		
		int ind=0;
		int T=sc.nextInt();
		while(T-->0){
		    res[ind]+=op[ind];
		    if(res[ind]==0)op[ind]=1;
		    if(res[ind]==arr[ind])op[ind]=-1;
		    for(int i=0;i<N;i++){
		        System.out.print(res[i]+" ");
		    }
		    System.out.println();
		    ind=(ind+1)%N;
		}
	}
}

//  N=4
// arr[]={2,3,1,4}  T=5
// output:
// 1 3 1 4
// 1 2 1 4
// 1 2 1 4
// 1 2 1 3
// 0 2 1 3
// 0 1 1 3
// 0 1 0 3
// 0 1 0 2
// 1 1 0 2
//etc upto T times