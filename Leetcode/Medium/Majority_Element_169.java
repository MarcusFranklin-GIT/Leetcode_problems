package Leetcode.Medium;
import java.util.*;
public class Majority_Element_169 {
    public int majorityElement(int[] nums) {
        int ele=nums[0];
        int count=0;
        for(int num:nums){
            if(count==0){
                ele=num;
                count=1;
            }else if(ele==num)count++;
            else count--;
        }
        return ele; 
    }
}
// this is the most optimal solution for this problem with time complexity of O(n) and space complexity of O(1)
// this works asumming that there is always a majority element in the array and the majority element is the one that appears more than n/2 times in the array

class BruteSolution {
    public int majorityElement(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] == nums[i]) count++;
            }
            if (count > n / 2) return nums[i];
        }
        return -1; // never reached
        //count each element 
    }
}

class HashMapSolution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > n / 2) {
                return num;
            }
        }
        return -1;
    }
}

class SortSolution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}

//this will work if there exist no element
class ifNotSolution {
    public int majorityElement(int[] nums) {
        int len=nums.length;
        int ele=nums[0];
        int count=0;
        for(int num:nums){
            if(count==0){
                ele=num;
                count=1;
            }else if(ele==num)count++;
            else count--;
        }
        int count1=0;
        for(int num:nums)if(num==ele)count1++;
        if(count1>len/2)return ele; 
        return -1;
    }
}
