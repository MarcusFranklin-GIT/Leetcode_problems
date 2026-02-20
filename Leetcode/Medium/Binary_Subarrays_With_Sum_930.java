package Leetcode.Medium;    
import java.util.*;
public class Binary_Subarrays_With_Sum_930 {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atmost(nums,goal)-atmost(nums,goal-1);
    }
    public static int atmost(int nums[],int goal){
        int left=0,right=0;
        int len=nums.length;
        int sum=0;
        int count1=0;
        if(goal<0)return 0;
        while(right<len){
            sum+=nums[right];
            while(sum>goal){
                sum-=nums[left];
                left++;
            }
            count1+=right-left+1;
            right++;
        }
        return count1;
    }
    // main solution (optimal)
}

class bruteSolution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum==goal)ans++;
            }
        }
        return ans;
    }
}