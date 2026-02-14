package Leetcode.Easy;
public class Excel_Sheet_Column_Number_171 {
    public int titleToNumber(String S) {
        int len=S.length();
        int num=0;
        for(int i=0;i<len;i++){
            num=((S.charAt(i)-'A')+1)+(26*num);
        }
        return num;
    }
}