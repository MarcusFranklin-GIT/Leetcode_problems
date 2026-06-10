import java.util.Arrays;
public class Edit_Distance_72 {
    //memoization method
    public int minDistance_Memoization(String word1, String word2) {
        int N =word1.length();
        int M =word2.length();

        int dp[][] = new int[N][M];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        return find(N-1,M-1,word1,word2,dp); 
    }
    private int find(int i,int j,String str1,String str2,int[][] dp){
        if(i<0)return j+1;
        if(j<0)return i+1;

        if(dp[i][j]!=-1)return dp[i][j];

        if(str1.charAt(i)==str2.charAt(j))return dp[i][j] =find(i-1,j-1,str1,str2,dp);
        else{
           return dp[i][j]= 1+ Math.min(find(i-1,j-1,str1,str2,dp),
                Math.min(find(i,j-1,str1,str2,dp),find(i-1,j,str1,str2,dp)));
        }
    }

    //tabulation method
    public int minDistance_Tabulation(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();

        int dp[][] = new int[len1+1][len2+1];

        for(int i=0;i<=len1;i++)dp[i][0]=i;
        for(int j=0;j<=len2;j++)dp[0][j]=j;

        for(int row=1;row<=len1;row++){
            for(int col=1;col<=len2;col++){
                if(word1.charAt(row-1)==word2.charAt(col-1)){
                    dp[row][col]=dp[row-1][col-1];
                }else{
                    dp[row][col]= 1 + Math.min(dp[row-1][col-1],
                        Math.min(dp[row][col-1],dp[row-1][col]));
                }
            }
        }
        return dp[len1][len2];
    }
}