class Maximum_Total_Subarray_Value_I_3689 {
    public long maxTotalValue(int[] nums, int k) {
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int num:nums){
            min=Math.min(num,min);
            max=Math.max(num,max);
        }
        return (long)(max-min)*k;
    }
}