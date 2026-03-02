public class Longest_Common_Subsequence_1143 {
    public int longestCommonSubsequence(String text1, String text2) {
        int len1=text1.length();
        int len2=text2.length();

        int DP[][]=new int[len1+1][len2+1];

        for(int row=1;row<=len1;row++){
            for(int col=1;col<=len2;col++){
                if(text1.charAt(row-1)==text2.charAt(col-1)){
                    DP[row][col]=DP[row-1][col-1]+1;
                }else{
                    DP[row][col]=Math.max(DP[row-1][col],DP[row][col-1]);
                }
            }
        }
        return DP[len1][len2];
    }
}