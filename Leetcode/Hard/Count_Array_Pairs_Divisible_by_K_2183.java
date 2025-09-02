package Leetcode.Hard;

import java.util.*;

public class Count_Array_Pairs_Divisible_by_K_2183 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4, 5};
        int k = 2;
        long result = solution.countPairs(nums, k);
        System.out.println("Count of array pairs divisible by " + k + ": " + result);
    }
}
class Solution {
    public int gcd(int a,int b){
        return (b==0)?a:gcd(b,a%b);
    }
    public long countPairs(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            int g=gcd(num,k);
            map.put(g,map.getOrDefault(g,0)+1);
        }
        long count=0;
        ArrayList<Integer> keys= new ArrayList<>(map.keySet());
        for(int i=0;i<keys.size();i++){
            for(int j=i;j<keys.size();j++){
                int g1=keys.get(i);
                int g2=keys.get(j);
                if(((long)g1*(long)g2)%k==0){
                    if(g1==g2){
                        long f=map.get(g1);
                        count+=f*(f-1)/2; 
                    }else {
                        count+=(long)(map.get(g1))*(long)(map.get(g2));
                    }
                }
            }
        }
        return count;
    }
}


//take gcd and count the values have same gcd 
// for each pair of keys (g1, g2) in the map, check if (g1 * g2) % k == 0
// if so, count the pairs 