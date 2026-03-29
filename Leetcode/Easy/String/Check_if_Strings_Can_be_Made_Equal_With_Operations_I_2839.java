public class Check_if_Strings_Can_be_Made_Equal_With_Operations_I_2839 {
    public boolean canBeEqual(String s1, String s2) {
        for(int i=2 ;i<s1.length();i++){
            if(s1.charAt(i)==s2.charAt(i) && s1.charAt(i-2)==s2.charAt(i-2))continue;
            if((s1.charAt(i)!= s2.charAt(i-2)) || (s1.charAt(i-2)!=s2.charAt(i)))return false;
        }
        return true;
    }
}