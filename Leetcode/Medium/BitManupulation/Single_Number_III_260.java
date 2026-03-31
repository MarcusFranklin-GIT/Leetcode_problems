class Single_Number_III_260 {
    public int[] singleNumber(int[] nums) {
        int val =0;
        for(int num:nums)val^=num;

        int RMB=(val & val-1)^val;
        int b1=0,b2=0;

        for(int num:nums){
            if((num & RMB)==0)b1^=num;
            else b2^=num;
        }

        return new int[] {b1,b2};
    }
}