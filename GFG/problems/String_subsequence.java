package problems;

public class String_subsequence {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.isSubSeq("abc", "ahbgdc")); // true
        System.out.println(sol.isSubSeq("axc", "ahbgdc")); // false
    }
}
class Solution {
    public boolean isSubSeq(String S1, String S2) {
        // code here
        int len1=S1.length();
        int len2=S2.length();
        int i=0,j=0;
        while(i<len1 && j<len2){
            if(S1.charAt(i)==S2.charAt(j)){
                i++;
                j++;
            }else{
                j++;
            }
        }
        return i==len1;
    }
};