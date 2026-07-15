package Math;

public class Find_Minimum_Operations_to_Make_All_Elements_Divisible_by_Three_3190 {
    public int minimumOperations(int[] nums) {
        int oper =0;
        for(int num : nums){
            oper+= Math.min(num%3, 3 -(num%3));
        }
        return oper;
    }
}
