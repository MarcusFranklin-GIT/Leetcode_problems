class Coin_Change_II_518 {
    public int change(int amount, int[] coins) {
        if(amount==0)return 1;
        int dp[] = new int[amount+1];
        dp[0]=1;
        for(int coin:coins){
            for(int i=coin ; i<=amount;i++){
                dp[i]=dp[i]+dp[i-coin];
            }
        }
        return dp[amount];
    }
}