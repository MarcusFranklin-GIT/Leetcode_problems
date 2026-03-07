import java.util.*;
class Longest_Substring_with_K_Uniques {
    public int longestKSubstr(String s, int k) {
        // code here
         Map<Character,Integer> map=new HashMap<>();
        
        int left=0;
        int right=0;
        int maxlen=-1;
        
        while(right<s.length()){
            char ch=s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.size()>k){
                char ch2=s.charAt(left);
                map.put(ch2,map.get(ch2)-1);
                if(map.get(ch2)==0)map.remove(ch2);
                left++;
            }
            if(map.size()==k)maxlen=Math.max(maxlen,right-left+1);
            right++;
            
        }
        return maxlen;
    }
}

// http://geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1