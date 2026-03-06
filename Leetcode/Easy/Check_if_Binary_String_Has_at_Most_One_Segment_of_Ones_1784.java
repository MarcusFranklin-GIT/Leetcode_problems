class Check_if_Binary_String_Has_at_Most_One_Segment_of_Ones_1784 {
    public boolean checkOnesSegment(String s) {
        int count=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(i-1))count++;
        }
        return count<2;
    }
}