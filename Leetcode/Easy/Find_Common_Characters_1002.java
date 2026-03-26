import java.util.*;
public class Find_Common_Characters_1002 {
    public List<String> commonChars(String[] words) {
        List<String> res = new LinkedList<>();

        int fre[] = new int[26];
        for(char ch: words[0].toCharArray()){
            fre[ch-'a']++;
        }

        for(int i=1;i<words.length ; i++){
            int temp[] =new int[26];
            for(char ch : words[i].toCharArray()){
                temp[ch-'a']++;
            }
            for(int j=0; j<26 ; j++){
                fre[j]=Math.min(temp[j],fre[j]);
            }
        }

        for(int i=0;i<26 ;i++){
            for(int j=0;j<fre[i];j++){
                res.add(String.valueOf((char)('a'+i)));
            }
        }
        return res;
    }
}