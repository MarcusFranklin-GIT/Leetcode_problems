public class Maximum_Substrings_With_Distinct_Start_3760 {
    public int maxDistinct(String s) {
        int count =0 ; 
        boolean fre[] = new boolean[26];
        for(char ch : s.toCharArray()){
            int val=ch-'a';
            if(!fre[val]){
                count++;
                fre[val]=true;
            }
        }
        return count;
    }
}