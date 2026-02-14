package Leetcode.Medium;
public class The_kth_Factor_of_n_1492 {
    public int kthFactor(int n, int k) {
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)count++;
            if(count==k)return i;
        }
        return -1;
    }
}