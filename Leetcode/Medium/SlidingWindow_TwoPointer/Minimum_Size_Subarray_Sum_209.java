
class Minimum_Size_Subarray_Sum_209 {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0,right=0;
        int len = nums.length;

        int sum=0;
        int minlen=len+1;
        while(right<len){
            sum+=nums[right++];
            while(sum>=target ){
                minlen=Math.min(minlen,right-left);
                sum-=nums[left++];
            }
        }
        return (minlen==len+1) ? 0 : minlen;
    }
}