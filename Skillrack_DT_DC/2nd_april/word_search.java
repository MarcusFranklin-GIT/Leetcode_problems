import java.util.*;
public class word_search {

    public static void main(String[] args) {
		//Your Code Here
		
		Scanner sc = new Scanner(System.in);
		
		String str=sc.nextLine();
		
		int len=str.length();
		
		String sub = sc.nextLine();
		
		int C=sc.nextInt();
		int R=len/C;
		
		char [][] mat = new char[R][C];
		
		for(int i=0;i<R;i++){
		    for(int j=0;j<C;j++){
		        int pos=(C*i)+j;
		        if(pos<len)mat[i][j]=str.charAt(pos);
		    }
		}
		int sublen= sub.length();
		for(int row=0;row<R;row++){
		    for(int col=0;col<C;col++){
		        if(mat[row][col]==sub.charAt(0)){
		            boolean flag=true;
		            for(int c=col;c<col+sublen;c++){
		                if(c>=C||mat[row][c]!=sub.charAt(c-col)){
		                    flag=false;
		                    break;
		                }
		            }
		            if(flag){
		                System.out.println(row+","+col);
		                System.out.println(row+","+(col+sublen-1));
		                return;
		            }
		            
		            flag=true;
		            for(int r=row;r<row+sublen ;r++){
		                if(r>=R ||mat[r][col]!=sub.charAt(r-row)){
		                    flag=false;
		                    break;
		                }
		            }
		            if(flag){
		                System.out.println(row+","+col);
		                System.out.println((row+sublen-1)+","+col);
		                return;
		            }
		        }
		    }
		}
		System.out.print("-1");
	}
}