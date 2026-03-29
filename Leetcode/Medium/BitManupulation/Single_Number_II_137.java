import java.util.*;
public class Single_Number_II_137 {
    public int singleNumber(int[] nums) {
         int ones = 0 , twos = 0;
        for(int num : nums){
            ones = (ones ^ num)&(~twos);
            twos = (twos ^ num)&(~ones);
        }
        return ones;
    }
}//optimal solution 


class Brute_Force_Solution_137 {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> mpp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) + 1); // Update the map
        }

        for (HashMap.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() == 1) {
                return it.getKey();
            }
        }
        return -1;
    }
}//brute force solution using hashmap

class Better_Solution1_137 {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int ans = 0;
        
        for (int bitIndex = 0; bitIndex < 32; bitIndex++) {
            int count = 0;
            
            for (int i = 0; i < n; i++) {
                
                if ((nums[i] & (1 << bitIndex)) != 0) {
                    count++;
                }
            }
            
            if (count % 3 != 0) {
                ans |= (1 << bitIndex);
            }
        }
        
        return ans;
    }
}//better solution using bit manipulation

class Better_Solution2_137 {
   
    public int singleNumber(int[] nums) {
        int n = nums.length;
        
        Arrays.sort(nums);
        
        for (int i = 1; i < nums.length; i += 3) {
            if (nums[i] != nums[i - 1]) {
                return nums[i - 1];
            }
        }
        return nums[n - 1];
    }
}//better solution using sorting
