package Leetcode.Easy;
public class Find_the_Index_of_the_First_Occurrence_in_a_String_28 {
    public int strStr(String haystack, String needle) {
        for(int i=0;i<haystack.length();i++){
            if(i<=haystack.length()-needle.length()){ 
                if(haystack.charAt(i)==needle.charAt(0)){
                int k=i;
                for(int j=0;j<needle.length();j++){
                    if(needle.charAt(j)!=haystack.charAt(k)) break;
                    else k++;
                    if(j==needle.length()-1)return i;
                }
            }
            }
        }
        return -1;
    }
}