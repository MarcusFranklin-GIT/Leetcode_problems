package Leetcode.Easy;

public class Longer_Contiguous_Segments_of_Ones_than_Zeros_1869 {
    public boolean checkZeroOnes(String s) {
        int zero=0,one=0;
        int countzero=0,countone=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)-'0'==0){
                countone=0;
                countzero++;
                zero=Math.max(zero,countzero);
            }else{
                countzero=0;
                countone++;
                one=Math.max(one,countone);
            }
        }
        return(one>zero);
    }
}