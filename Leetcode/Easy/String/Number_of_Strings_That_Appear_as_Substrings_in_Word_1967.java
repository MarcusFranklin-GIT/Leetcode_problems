class Number_of_Strings_That_Appear_as_Substrings_in_Word_1967 {
    public int numOfStrings(String[] patterns, String word) {
        int cnt =0 ;
        for(String str : patterns){
            if(word.contains(str))cnt++;
        }
        return cnt;
    }
}