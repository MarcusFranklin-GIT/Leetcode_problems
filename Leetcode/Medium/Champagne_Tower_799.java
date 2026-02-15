package Leetcode.Medium;
public class Champagne_Tower_799 {
    public double champagneTower(int poured, int query_row, int query_glass) {
        int ROW=query_row+2;
        double dp[][]=new double[ROW][ROW];
        dp[0][0]=poured;
        for(int row=0;row<=query_row;row++){
            for(int col=0;col<=row;col++){
                if(dp[row][col]>1){
                    double overflow=(dp[row][col]-1)/2.0;
                    dp[row+1][col]+=overflow;
                    dp[row+1][col+1]+=overflow;
                }
            }
        }
        return Math.min(dp[query_row][query_glass],1.0);
    }
}