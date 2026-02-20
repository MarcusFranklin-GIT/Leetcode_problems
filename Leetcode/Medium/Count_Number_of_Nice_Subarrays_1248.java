package Leetcode.Medium;

class Count_Number_of_Nice_Subarrays_1248 {
    public int numberOfSubarrays(int[] nums, int k) {
        return oddcount(nums,k)-oddcount(nums,k-1);
    }
    public int oddcount(int []nums,int k){
        if(k<0)return 0;

        int left=0,right=0;
        int len=nums.length;
        int count=0,sum=0;
        while(right<len){
            sum+=nums[right]%2;
            while(sum>k){
                sum-=nums[left]%2;
                left++;
            }
            count+=right-left+1;
            right++;
        }
        return count;
    }
}