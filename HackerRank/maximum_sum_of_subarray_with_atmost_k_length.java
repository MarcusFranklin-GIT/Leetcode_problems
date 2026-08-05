import java.util.*;
public class maximum_sum_of_subarray_with_atmost_k_length {
    public static int maximumSum(int[] nums, int k) {
        int len = nums.length;
        long [] prefix = new long[len+1];

        if(k<=0)return 0;

        for(int i=0;i<len;i++){
            prefix[i+1] = prefix[i]+nums[i];
        }

        Deque<Integer> dq = new ArrayDeque<>();
        
        dq.offerLast(0);

        long ans =Long.MIN_VALUE;

        for(int i=1;i<=len;i++){

            while(!dq.isEmpty() && dq.peekFirst()<i-k)dq.pollFirst();
            
            if (!dq.isEmpty())
                ans = Math.max(ans, prefix[i] - prefix[dq.peekFirst()]);

            while(!dq.isEmpty() && prefix[i]<=prefix[dq.peekLast()])dq.pollLast();

            dq.offerLast(i);
        }

        return (int)ans;

    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 4, -5, 6};
        int k = 3;
        System.out.println("Maximum sum of subarray with at most length " + k + " is: " + maximumSum(arr, k));
    }
}