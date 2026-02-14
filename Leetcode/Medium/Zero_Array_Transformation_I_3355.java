package Leetcode.Medium;
public class Zero_Array_Transformation_I_3355 {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] freq = new int[n + 1];

        for(int[] q:queries){
            freq[q[0]]+=1;
            if(q[1]+1<n){
                freq[q[1]+1]-=1;
            }
        }
        int hits=0;
        for(int i=0;i<n;i++){
            hits+=freq[i];
            nums[i]-=Math.min(nums[i], hits);
            if(nums[i]!=0) return false;
        }
        return true;
       
    }
}
