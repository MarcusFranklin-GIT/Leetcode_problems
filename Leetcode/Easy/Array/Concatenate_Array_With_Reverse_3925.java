public class Concatenate_Array_With_Reverse_3925 {
    public int[] concatWithReverse(int[] nums) {
        int len = nums.length;
        int res[] = new int[len*2];
        for(int i=0;i<len;i++){
            res[i]=nums[i];
            res[(len*2)-1-i] = nums[i];
        }
        return res;
    }
}
