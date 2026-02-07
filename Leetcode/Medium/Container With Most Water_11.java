package Leetcode.Medium;
class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int max=0;
        while(i<j){
            if((Math.min(height[i],height[j])*(j-i))>max){
                max=Math.min(height[i],height[j])*(j-i);
            }
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
}