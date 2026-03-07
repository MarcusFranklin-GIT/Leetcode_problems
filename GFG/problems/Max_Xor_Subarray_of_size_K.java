class Max_Xor_Subarray_of_size_K {
    public int maxSubarrayXOR(int[] arr, int k) {
        // code here
        int val=0;
        for(int i=0;i<k;i++){
            val^=arr[i];
        }
        int max=val;
        int right=k,left=0;
        while(right<arr.length){
            val^=arr[right++];
            val^=arr[left++];
            max=Math.max(max,val);
        }
        return max;
    }
}

// https://www.geeksforgeeks.org/problems/max-xor-subarray-of-size-k/1