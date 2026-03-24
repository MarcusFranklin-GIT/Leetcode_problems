// own solution ( not optimal)
import java.util.*;
public class Find_and_Replace_Pattern_890 {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result =new LinkedList<>();
        HashMap<Character,Integer> map = new HashMap<>();
        int patternindex[] =new int[pattern.length()];

        for(int i=0 ; i<pattern.length() ; i++){
            char ch=pattern.charAt(i);
            if(map.get(ch)==null){
                map.put(ch,i);
            }
            patternindex[i]=map.get(ch);
        }

        for(String str : words){
            boolean flag=true;
            HashMap<Character,Integer> map2 = new HashMap<>();
            for(int i=0;i<str.length();i++){
                char ch = str.charAt(i);
                if(map2.get(ch)==null){
                    map2.put(ch,i);
                }
                if(map2.get(ch)!= patternindex[i]){
                    flag=false;
                    break;
                }
            }
            if(flag)result.add(str);
        }
        return result;
    }
}