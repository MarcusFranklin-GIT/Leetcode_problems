package filtration_test;

import java.util.*;
public class wand_spell {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int R=sc.nextInt();
        int C=sc.nextInt();
        char arr[][]=new char[R][C];
        sc.nextLine();
        int row=0,col=0;
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                arr[i][j]=sc.next().charAt(0);
                if(arr[i][j]=='B'){
                    row=i;
                    col=j;
                }
            }
        }
        boolean visited[][]=new boolean[R][C];
        int N=sc.nextInt();
        
        
        if(path(R,C,row,col,arr,N,visited)){
            System.out.print("yes");
            return;
        }
        System.out.print("no");
	}
	
	static int diff[][]={{0,1},{1,0},{-1,0},{0,-1}};
	
	public static boolean path(int R,int C,int row,int col,char[][] arr,int N,boolean[][] visited){
	    
	    if(row>=R || row<0 || col<0 || col>=C || N<0 )return false;
	    
	    if(arr[row][col]=='W') return true;
	    if(visited[row][col]) return false;
	    
	    visited[row][col]=true;
	    
	    int num=N;
	    if(Character.isDigit(arr[row][col])){
	        num=N-(arr[row][col]-'0');
	    }
	    
	    for(int div[]:diff){
	        int adjR=row+div[0];
	        int adjC=col+div[1];
	        
	        if(path(R,C,adjR,adjC,arr,num,visited)){
	            return true;
	        }
	        
	    }
	    visited[row][col]=false;
	    return false;
	}
}