package filtration_test;

import java.util.*;
class salesman_salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int max=0, cur=0;
        for(int x: arr){
            if(x==0) cur=0;
            else{
                cur+=x;
                max=Math.max(max,cur);
            }
        }
        System.out.println(max);
    }
}
