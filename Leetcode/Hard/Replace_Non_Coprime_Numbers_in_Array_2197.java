package Leetcode.Hard;
import java.util.*;
class Replace_Non_Coprime_Numbers_in_Array_2197 {
    public int gcd(int a, int b){
        return (b == 0)? a : gcd(b, a%b);
    }
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        for(int num:nums){
            int curr = num;
            while(!ans.isEmpty()){
                int g = gcd(ans.get(ans.size() - 1), curr);
                if (g == 1) break;
                curr = (curr/g)*ans.get(ans.size() - 1);
                ans.remove(ans.size()-1);
            }
            ans.add(curr);

        }
        return ans;
    }
}