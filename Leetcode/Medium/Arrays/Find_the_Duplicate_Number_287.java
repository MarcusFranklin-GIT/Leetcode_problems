class Find_the_Duplicate_Number_287 {
    public int findDuplicate(int[] nums) {
        int fast = nums[0];
        int slow = nums[0];

        while(true){
            slow = nums[slow];
            fast = nums[nums[fast]];
            if(slow==fast)break;
        }

        fast = nums[0];

        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }

        return slow;
    }
}