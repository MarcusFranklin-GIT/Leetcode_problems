class Minimum_Changes_To_Make_Alternating_Binary_String_1758 {
    public int minOperations(String s) {
        int change1=0,change2=0;
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                if(s.charAt(i)=='1')change1++;
                else change2++;
            }else{
                if(s.charAt(i)=='1')change2++;
                else change1++;
            }
        }
        return Math.min(change1,change2);
    }
}