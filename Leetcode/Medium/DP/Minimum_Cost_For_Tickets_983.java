public class Minimum_Cost_For_Tickets_983 {
    public int mincostTickets(int[] days, int[] cost) {
        int len=days.length;
        int [] dp = new int[days[len-1]+1];
        boolean [] travel = new boolean[days[len-1]+1];

        for(int day : days){
            travel[day]=true;
        }
        for(int i=1 ; i<=days[len-1] ;i++){
            if(travel[i]){
                int cost1 = dp[i-1]+cost[0];
                int cost2 = dp[Math.max(0,i-7)]+cost[1];
                int cost3 = dp[Math.max(0,i-30)]+cost[2];
                dp[i]=Math.min(cost1,Math.min(cost2,cost3));
            }else{
                dp[i]=dp[i-1];
            }
        }
        return dp[days[len-1]];
    }
}