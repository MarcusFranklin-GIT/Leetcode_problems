    import java.util.*;
public class Capacitor {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int R=sc.nextInt();
        int C=sc.nextInt();
        int diff[][]={{0,1},{0,-1},{1,0},{-1,0},{-1,-1},{-1,1},{1,-1},{1,1}};
        
        int mat[][] =new int[R][C];
        char cha[][]=new char[R][C];
        for(char [] row:cha){
            Arrays.fill(row,'0');
        }
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                mat[i][j]=sc.nextInt();
                if(mat[i][j]==1){
                    cha[i][j]='C';
                    for(int D[]:diff){
                        int adjR=i+D[0];
                        int adjC=j+D[1];
                        change(adjR,adjC,cha,R,C);
                    }
                    
                }
                
            }
        }
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                System.out.print(cha[i][j]+" ");
            }
            System.out.println();
        }
        
	}
	public static void change(int r,int c,char cha[][],int R,int C){
	    if(r<R && r>=0 && c<C && c>=0){
	        cha[r][c]='C';
	    }
	}
}