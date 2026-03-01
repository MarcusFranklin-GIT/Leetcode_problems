public class Move_Zeroes_283 {
    public void moveZeroes(int[] nums) {
        int left=0,right=0;
        while(right<nums.length){
            if(nums[right]!=0){
                swap(left,right,nums);
                right++;
                left++;
            }else{
                right++;
            }
        }
    }
    void swap(int left,int right,int[]arr){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
}