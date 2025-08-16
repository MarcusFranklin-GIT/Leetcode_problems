import java.util.*;
public class FindMissingNuminMat {

    public static void main(String[] args) {
		//Your Code Here
		
		Scanner sc=new Scanner(System.in);
		int R=sc.nextInt();
		int C=sc.nextInt();
		char mat[][]=new char[R][C];
		for(int i=0;i<R;i++){
		    for(int j=0;j<C;j++){
		        mat[i][j]=sc.next().charAt(0);
		    }
		}
		
		for(int matR=0;matR<R;matR+=3){
		    for(int matC=0;matC<C;matC+=3){
		        int fre[]=new int[9];
		        for(int row=matR;row<matR+3;row++){
		            for(int col=matC;col<matC+3;col++){
		                if(mat[row][col]=='-')continue;
		                fre[mat[row][col]-'1']++;
		            }
		        }
		        
		        for(int row=matR;row<matR+3;row++){
		            for(int col=matC;col<matC+3;col++){
		                if(mat[row][col]=='-'){
		                    for(int i=0;i<9;i++){
		                        if(fre[i]==0){
		                            fre[i]++;
		                            mat[row][col]=(char)('1'+i);
		                            break;
		                        }
		                    }
		                }
		            }
		        }
		    }
		}
		for(int row=0;row<R;row++){
		    for(int col=0;col<C;col++){
		        System.out.print(mat[row][col]+" ");
		    }
		    System.out.println(" .");
		}
        sc.close();
	}
}