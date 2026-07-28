public class Count_Subarrays_With_Majority_Element_I_3737 {
    public int countMajoritySubarrays(int[] nums, int target) {
        int res=0;

        for(int left=0; left<nums.length ; left++){
            int count=0;
            for(int right=left ;right<nums.length; right++){
                if(nums[right]==target)count++;
                if((right-left)+1 < count*2)res++;
            }
        }
        return res;
    }
}
