package Leetcode.Easy;

public class Plus_One_66 {
    public int[] plusOne(int[] digits) {
        int len=digits.length;
            int ptr=len-1;
            int carry=1;
            while(ptr>=0){
                int sum=digits[ptr]+carry;
                digits[ptr]=sum%10;
                carry=sum/10;
                if(carry==0)break;
                ptr--;
            }
        if(carry==1){
            digits=new int[len+1];
            digits[0]=1;
        } 
        return digits;
    }
}