package Leetcode.Easy;
public class Search_Insert_Position_35 {
    public int searchInsert(int[] nums, int target) {
        int left=0,right=nums.length-1;
        while(left<=right){
            int mid=((right-left)/2)+left;
            if(nums[mid]==target)return mid;
            else if(nums[mid]<target)left=mid+1;
            else right=mid-1;
        }
        return left;
    }
}