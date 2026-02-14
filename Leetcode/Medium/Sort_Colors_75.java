package Leetcode.Medium;
public class Sort_Colors_75 {
    public void sortColors(int[] nums) {
        int left=0,mid=0;
        int right=nums.length-1;
        while(mid<=right){
            if(nums[mid]==0){
                swap(nums,mid,left);
                left++;
                mid++;
            }else if(nums[mid]==1)mid++;
            else{
                swap(nums,mid,right);
                right--;
            }
        }
        return;
    }
    public void swap(int[] nums,int ind1,int ind2){
        int temp=nums[ind1];
        nums[ind1]=nums[ind2];
        nums[ind2]=temp;
    }
}