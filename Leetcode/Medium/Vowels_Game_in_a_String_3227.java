package Leetcode.Medium;
class Vowels_Game_in_a_String_3227 {
    public boolean doesAliceWin(String s) {
     for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(c=='a'||c=='o'||c=='i'||c=='e'||c=='u')return true;
     }
     return false;   
    }
}

