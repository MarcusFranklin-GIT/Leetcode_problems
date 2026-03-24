// my soluthion ( best)
public class Find_Pivot_Index_724 {
    public int pivotIndex(int[] nums) {
        int len = nums.length;

        int prefixsum[]= new int[len+2];
        int suffixsum[]= new int[len+2];
        
        prefixsum[1] = nums[0];
        suffixsum[len] = nums[len-1];

        for(int i=2 ; i<len ; i++){
            prefixsum[i]=nums[i-1]+prefixsum[i-1];
        }
        for(int i=len-1 ; i>0 ;i--){
            suffixsum[i]=nums[i-1]+suffixsum[i+1];
        }

        for(int i=1 ; i<=len ; i++){
            int prev= prefixsum[i-1];
            int suf = suffixsum[i+1];
            if(prev == suf)return i-1;
        }
        return -1;
    }
}

// nitish punda maven solution (puluthi)
class nitish_punda_maven_solution {
    public int pivotIndex(int[] nums) {
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