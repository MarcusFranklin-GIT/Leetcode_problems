package Leetcode.Easy;
import java.util.*;
public class Find_Words_Containing_Character_2942 {
    public List<Integer> findWordsContaining(String[] words, char x) {
         List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                if(words[i].charAt(j)==x){
                    list.add(i);
                    break;
                }
            }
        }
        return list;
    }
}