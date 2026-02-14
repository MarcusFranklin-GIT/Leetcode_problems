package Leetcode.Easy;
public class Type_of_Triangle_3024 {
    public String triangleType(int[] nums) {
        if(nums[0]==nums[1] && nums[1]==nums[2] && nums[0]==nums[2]){
            return "equilateral";
        }else if(nums[0]==nums[1] || nums[1]==nums[2] || nums[0]==nums[2]){
           if(nums[0]+nums[1]>nums[2] && nums[1]+nums[2]>nums[0] && nums[0]+nums[2]>nums[1]){
                return "isosceles";
            }
        }else{
            if(nums[0]+nums[1]>nums[2] && nums[1]+nums[2]>nums[0] && nums[0]+nums[2]>nums[1]){
                return "scalene";
            }
        }
        return "none";
    }
}