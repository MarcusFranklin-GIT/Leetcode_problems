package Leetcode.Easy;
import java.util.*;
class Maximum_Number_of_Words_You_Can_Type_1935 {
    public int canBeTypedWords(String text, String b) {
        Set<Character> bl=new HashSet<>();
        for(int i=0;i<b.length();i++){
            bl.add(b.charAt(i));
        }
        String S[]=text.split(" ");
        int count=S.length;
        for(String str:S){
            for(int i=0;i<str.length();i++){
                if(bl.contains(str.charAt(i))){
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}