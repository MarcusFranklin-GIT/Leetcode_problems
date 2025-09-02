package HackerRank;

import java.util.*;

public class Minimum_Platforms {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        int dep[]=new int[N];
        for(int i=0;i<N;i++)arr[i]=sc.nextInt();
        for(int i=0;i<N;i++)dep[i]=sc.nextInt();
        Arrays.sort(dep);

        int p=1,max= 1;
        int i=1,j=0;

        while (i < N && j < N) {
            if (arr[i] <= dep[j]) {
                p++;
                i++;
            } else {
                p--;
                j++;
            }
            max = Math.max(max, p);
        }

        System.out.println(max);
        
       
    }
} 


// Given the arrival and departure times of all trains that reach a railway station, 
// the task is to find the minimum number of platforms required for the railway station so that no train waits.
// We are given two arrays that represent the arrival and departure times of trains that stop.
// Sample Input 0

// 6
// 900 940 950 1100 1500 1800
// 910 1200 1120 1130 1900 2000
// Sample Output 0

// 3

// Sample Input 1

// 3
// 900 1100 1235
// 1000 1200 1240
// Sample Output 1

// 1