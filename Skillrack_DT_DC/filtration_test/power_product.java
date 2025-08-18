package filtration_test;

import java.util.*;
class power_product{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[k];
        for(int i=0;i<k;i++)arr[i]=sc.nextInt();
        Arrays.sort(arr);

        for(int i=k-1;i>=0;i--){
            if(arr[i]==1)continue;
            while(N%arr[i]==0){
                N=N/arr[i];
            }
        }
        if(N==1){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }
}




// Given a number N and an array of numbers of size K, print "yes" if N can be
// formed by multiplying the powers of the given numbers.

// Input:
// 75 2
// 5 3

// Output:
// yes

// Input:
// 36 3
// 2 6 1

// Output:
// yes
