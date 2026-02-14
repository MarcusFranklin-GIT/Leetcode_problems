package Leetcode.Easy;

public class Consecutive_Characters_1446 {
    public int maxPower(String s) {
        int maxlen=1,count=1;;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)==s.charAt(i))count++;
            else{
                maxlen=Math.max(maxlen,count);
                count=1;
            }
        }
        return Math.max(maxlen,count);
    }
}