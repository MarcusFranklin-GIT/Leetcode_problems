package Leetcode.Medium;
import java.util.*;
public class Longest_Substring_Without_Repeating_Characters {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> position=new HashMap<>();
        int len=s.length();
        int left=0,right=0;
        int currlen=0,maxlen=0;
        while(right<len){
            if(position.get(s.charAt(right))!=null){
                if(position.get(s.charAt(right))>=left){
                    left=position.get(s.charAt(right))+1;
                }
            }
            position.put(s.charAt(right),right);
            currlen=right-left+1;
            maxlen=Math.max(maxlen,currlen);
            right++;
        }
        return maxlen;
    }
}