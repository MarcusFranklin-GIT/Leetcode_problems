package Array;
public class Separate_the_Digits_in_an_Array_2553 {
    public int[] separateDigits(int[] nums) {
        int len=0;
        for(int num:nums){
            while(num>0){
                num/=10;
                len++;
            }
        }
        int []res = new int[len--];

        for(int i=nums.length-1; i>=0;i--){
            int num=nums[i];
            while(num>0){
                res[len--]=num%10;
                num/=10;
            }
        }

        return res;
    }
}