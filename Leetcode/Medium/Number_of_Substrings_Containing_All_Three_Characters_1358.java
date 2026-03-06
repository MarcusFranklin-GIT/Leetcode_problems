import java.util.Arrays;
class Number_of_Substrings_Containing_All_Three_Characters_1358 {
    public int numberOfSubstrings(String s) {
        int count=0;
        int lastSeen[]=new int[3];
        Arrays.fill(lastSeen,-1);

        for(int i = 0 ; i < s.length() ; i++ ){
            lastSeen[ s.charAt(i) - 'a' ] = i;
            
            int min = Math.min( lastSeen[0] , Math.min(lastSeen[1] , lastSeen[2]));
            
            count+=(min+1);
        }
        return count;
    }
}