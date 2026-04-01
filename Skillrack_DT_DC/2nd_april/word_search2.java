import java.util.*;
public class word_search2 {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		
		String mainStr = sc.nextLine();
		
		String substr  = sc.nextLine();
		
		int sublen = substr.length();
		
		int C = sc.nextInt();
		
		int strlen=mainStr.length();
		
		int R = strlen/C;
		
		char grid[][] = new char[R][C];
		
		for(int i=0;i<R;i++){
		    for(int j=0;j<C;j++){
		        int pos=(C*i)+j;
		        if(pos<strlen)grid[i][j]=mainStr.charAt(pos);
		    }
		}
		
		for(int row=0;row<R;row++){
		    for(int col=0;col<C;col++){
		        if(grid[row][col]==substr.charAt(0)){
		            if(check(R,C,row,col,0,1,substr,grid)){
		                System.out.println(row+","+col);
		                System.out.println(row+","+(col+sublen-1));
		                return;
		            }
		            if(check(R,C,row,col,1,0,substr,grid)){
		                System.out.println(row+","+col);
		                System.out.println((row+sublen-1)+","+col);
		                return;
		            }
		        }
		    }
		}
		System.out.print("-1");
	}
	
	private static boolean check(int R,int C,int r,int c,int dirR,int dirC,String substr,char[][]grid){
	    int len=substr.length();
	    for(int ind=0;ind<len ; ind++){
	        if(r>=R || c>=C || grid[r][c]!=substr.charAt(ind))return false;
	        r+=dirR;
	        c+=dirC;
	    }
	    return true;
	}
}