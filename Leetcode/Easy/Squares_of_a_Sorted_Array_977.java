package Leetcode.Easy;

public class Squares_of_a_Sorted_Array_977 {
    public int[] sortedSquares(int[] nums) {
        int len=nums.length;
        int left=0,right=len-1;
        int pos=len-1;
        int result[]=new int[len];
        
        while(left<=right){

            int rightval=nums[right]*nums[right];
            int leftval=nums[left]*nums[left];

            if(leftval>rightval){
                result[pos--]=leftval;
                left++;
            }else{
                result[pos--]=rightval;
                right--;
            }
        }
        return result;
    }
}