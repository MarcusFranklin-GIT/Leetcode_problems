package Leetcode.Easy;

public class Length_of_Last_Word_58 {
    public int lengthOfLastWord(String s) {
        boolean flag=false;;
        int len=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                flag=true;
                len++;
            }else if(flag)break;
        }
        return len;  
    }
}