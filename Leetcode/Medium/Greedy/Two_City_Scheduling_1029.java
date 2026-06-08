package Leetcode.Medium.Greedy;
import java.util.Arrays;
public class Two_City_Scheduling_1029 {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, (a,b) -> (a[1]-a[0])-(b[1]-b[0]));
        int sum=0;
        int len=costs.length;
        for(int i=0;i<len;i++){
            if(i<len/2)sum+=costs[i][1];
            else sum+=costs[i][0];
        }

        return sum;
    }
}