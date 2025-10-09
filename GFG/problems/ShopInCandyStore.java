package problems;
import java.util.ArrayList;
import java.util.Arrays;

public class ShopInCandyStore {
    public static void main(String[] args) {
        // Example usage
        int[] prices = {1, 2, 3, 4, 5};
        int k = 2;
        Solution solution = new Solution();
        ArrayList<Integer> result = solution.minMaxCandy(prices, k);
        System.out.println(result); // Output: [3, 7]
    }
}


class Solution {
    public ArrayList<Integer> minMaxCandy(int[] prices, int k) {
        // code here
        Arrays.sort(prices);
        ArrayList<Integer> ans=new ArrayList<>();
        int min=0,max=0,K=0;
        int len=prices.length;
        if(K==len){
            ans.add(prices[0]);
            ans.add(prices[len-1]);
        }
        for(int i=0;i<len-K;i++){
            min+=prices[i];
            max+=prices[len-i-1];
            K+=k;
        }
        
        ans.add(min);
        ans.add(max);
        return ans;
    }
}
