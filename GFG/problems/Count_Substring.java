import java.util.Arrays;
class Count_Substring {
    public static int countSubstring(String s) {
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

// https://www.geeksforgeeks.org/problems/count-substring/1