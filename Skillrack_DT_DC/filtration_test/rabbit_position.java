package filtration_test;

import java.util.*;
public class rabbit_position {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int R=sc.nextInt();
        int C=sc.nextInt();
        int row=sc.nextInt();
        int col=sc.nextInt();
        sc.nextLine();
        String S=sc.nextLine();
        
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='L'){
                if(border(R,C,row,col-1)){
                    col--;
                }else{
                    continue;
                }
                
            }
            if(S.charAt(i)=='R'){
                if(border(R,C,row,col+1)){
                    col++;
                }else{
                    continue;
                }
            }
            if(S.charAt(i)=='T'){
                if(border(R,C,row-1,col)){
                    row--;
                }else{
                    continue;
                }
            }
            if(S.charAt(i)=='B'){
                if(border(R,C,row+1,col)){
                    row++;
                }else{
                    continue;
                }
            }
        }
        System.out.print(row+" "+col);
	}
	public static boolean border(int R,int C,int row,int col){
	    if(row<R && col<C && row>=0 && col>=0)return true;
	    else return false;
	}
}