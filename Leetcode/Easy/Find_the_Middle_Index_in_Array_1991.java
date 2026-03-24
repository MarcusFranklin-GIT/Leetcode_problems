class Find_the_Middle_Index_in_Array_1991 {
    public int findMiddleIndex(int[] nums) {
        int len= nums.length;

        int totalsum=0;

        for(int num: nums)totalsum+=num;

        int leftsum=0;
        for(int i=0 ; i<len ; i++){
            if(leftsum == (totalsum-leftsum-nums[i]))return i;
            leftsum+=nums[i];
        }
        return -1;
    }
}