package frequency;

public class Maximum_Number_of_Balloons_1189 {
    public int maxNumberOfBalloons(String text) {
        int fre[]= new int[26];
        
        for(char ch : text.toCharArray()){
            fre[ch-'a']++;
        }
        
        int words = Integer.MAX_VALUE;
        
        words=Math.min(words,fre[1]);
        words=Math.min(words,fre[0]);
        words=Math.min(words,fre[11]/2);
        words=Math.min(words,fre[14]/2);
        words=Math.min(words,fre[13]);
        
        return words;
    }
}
