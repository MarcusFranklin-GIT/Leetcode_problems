package DP;


import java.util.Scanner;

public class num_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++) {
            if(i%2==0){
                for(int j=n*i;j>n*(i-1);j--){
                    System.out.print(j + " ");
                }
            }else{
                for(int j=(n*(i-1))+1;j<=n*i;j++){
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
//Given: 3
//Answer: 1 2 3
//         6 5 4
//         7 8 9

