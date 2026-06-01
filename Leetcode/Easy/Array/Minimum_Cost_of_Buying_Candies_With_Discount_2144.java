import java.util.Arrays;
class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);

        int len=cost.length;
        int sum=0;

        for(int i =0 ; i<len ;i++){
            if((i+1)%3 ==0)continue;
            sum+=cost[len-1-i];
        }

        return sum;
    }
}