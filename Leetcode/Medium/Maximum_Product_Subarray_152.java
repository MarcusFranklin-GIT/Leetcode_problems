public class Maximum_Product_Subarray_152 {
    public int maxProduct(int[] nums) {
        int product=Integer.MIN_VALUE,start=1,end=1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(start==0)start=1;
            if(end==0)end=1;
            start*=nums[i];
            end*=nums[n-i-1];
            product=Math.max(product,Math.max(start,end));
        }
            return product;
    }
}

class brutSolution {
    public int maxProduct(int[] nums) {
        int product=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int temp=1;
            for(int j=i;j<n;j++){
                temp*=nums[j];
                product=Math.max(product,temp);
            }
        }
            return product;
    }
}