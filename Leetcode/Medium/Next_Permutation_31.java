package Leetcode.Medium;    
class Next_Permutation_31 {
    public void nextPermutation(int[] nums) {
       int b=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                b=i;
                break;
            }
        } // check if decending

        //if decending then reverse the full array to get the next permutaton 
        if(b==-1){
            int start=0,end=nums.length-1;
            while(start<end){
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end--;
            }
        }else{
            //if not decending reverse from the point to get nxt permute
            for(int ind=nums.length-1;ind>b;ind--){
                if(nums[ind]>nums[b]){
                    int temp=nums[ind];
                    nums[ind]=nums[b];
                    nums[b]=temp;
                    break;
                }
            }
            int start=b+1,end=nums.length-1;
            while(start<end){
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end--;
            }
        }
        return;
    }
}