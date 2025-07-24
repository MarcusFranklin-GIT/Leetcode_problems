import java.util.Scanner;

public class convert_matrixto_linear {
    public static void main(String[] argd){
        Scanner sc=new Scanner(System.in);  
        int R=sc.nextInt();
        int C=sc.nextInt();
        int[][] matrix=new int[R][C];
        int [] linear=new int[R*C];
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                matrix[i][j]=sc.nextInt();
                linear[i*C+j]=matrix[i][j];
            }
        }

        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        for(int i=0;i<R*C;i++){
            System.out.print(linear[i]+" ");
        }
        //convert linear to matrix with only one loop
        System.out.println();
        int COL=3;
        for(int i=0;i<linear.length;i++){
            System.out.print(linear[i]+" ");
            if((i+1)%COL==0){
                System.out.println();
            }
        }
        
    }
}
