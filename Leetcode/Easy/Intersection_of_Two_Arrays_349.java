import java.util.*;
public class Intersection_of_Two_Arrays_349 {
    public static void main(String[] args) {
        int nums1[] = {1,2,2,1}, nums2[] = {2,2};
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.intersection(nums1, nums2)));
    }
}
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        boolean present[]=new boolean[1001];
        boolean added[]=new boolean[1001];
        
        for(int i=0;i<nums1.length;i++){
            present[nums1[i]]=true;
        }
        int ans[]=new int[Math.min(nums1.length,nums2.length)];
        int ind=0;
        for(int i=0;i<nums2.length;i++){
            if(present[nums2[i]] && !added[nums2[i]]){
                added[nums2[i]]=true;
                ans[ind++]=nums2[i];
            }
        }
        return Arrays.copyOf(ans, ind);
    }
}