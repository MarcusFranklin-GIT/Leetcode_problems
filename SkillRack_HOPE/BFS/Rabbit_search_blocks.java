package BFS;
//without visited;
import java.util.*;
public class Rabbit_search_blocks {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int R=sc.nextInt();
		int C=sc.nextInt();
		char arr[][]=new char[R][C];
		int r=0,c=0;
		for(int i=0;i<R;i++){
		    for(int j=0;j<C;j++){
		        arr[i][j]=sc.next().charAt(0);
		        if(arr[i][j]=='R'){
		            r=i;
		            c=j;
		        }
		    }
		}
        Queue<int[]> Q=new LinkedList<>();
        Q.add(new int[] {r,c});
        int count=0;
        while(!Q.isEmpty()){
            int len=Q.size();
            while(len-->0){
                int pos[]=Q.poll();
                if(arr[pos[0]][pos[1]]=='C'){
                    System.out.print(count);
                    return;
                }
                adjacent(pos[0],pos[1],R,C,arr,Q);
            }
            count++;
        }
	}
	public static void adjacent(int row,int col,int R,int C,char [][]arr,Queue<int[]> Q){
	    int diff[][]={{-1,0},{1,0},{0,1},{0,-1}};
	    for(int dir[]:diff){
	        int adjR=row+dir[0];
	        int adjC=col+dir[1];
	        if(adjR>=0 && adjR<R && adjC>=0 && adjC<C){
	            if(!Q.contains(new int[]{adjR,adjC}) && arr[adjR][adjC]!='1'){
	                Q.add(new int[]{adjR,adjC});
	            }
	        }
	    }
	    return;
	}
}

