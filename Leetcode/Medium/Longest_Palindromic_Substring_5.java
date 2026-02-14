package Leetcode.Medium; 
public class Longest_Palindromic_Substring_5 {
    public String longestPalindrome(String s) {
        int len=s.length();
        int[][] arr= new int[len][len];
        String ans="-1";
        for(int i=0;i<len;i++){
            arr[i][i]=1;
            ans=s.substring(i,i+1);
        }
        for(int col=2;col<=len;col++){
            for(int row=0;row<=len-col;row++){
                if(s.charAt(row)==s.charAt(row+col-1)){
                    if(col<=3){
                        arr[row][row+col-1]=1;
                        ans=s.substring(row,col+row);
                    }
                    else if(arr[row+1][row+col-2]==1){
                        arr[row][row+col-1]=1;
                        ans=s.substring(row,col+row);
                    }
                }else{
                    arr[row][row+col-1]=0;
                }
            }
        }
        return ans;
    }
}