package filtration_test;


import java.util.*;
public class Rabbit_search_carrot {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int R=sc.nextInt();
        int C=sc.nextInt();
        char mat[][]=new char[R][C];
        sc.nextLine();
        int row=0,col=0;
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                mat[i][j]=sc.next().charAt(0);
                if(mat[i][j]=='R'){
                    row=i;
                    col=j;
                }
            }
        }
        if(carrot(R,C,row,col,mat)){
            System.out.print("yes");
        }else{
        System.out.print("no");
        }
	}
	public static boolean carrot(int R,int C,int row,int col,char [][]mat){
	    if(row>=R ||col>=C) return false;
	    if(mat[row][col]=='0') return false;
	    if(mat[row][col]=='C')return true;
	    return carrot(R,C,row+1,col,mat)||carrot(R,C,row,col+1,mat);
	}
}



//this problem can be solved using DFS
//rabbit search problem ,it can move in 2 directions(down and right)
//