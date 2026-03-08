import java.util.*;
public class Find_Unique_Binary_String_1980 {
    public String findDifferentBinaryString(String[] nums) {
        Set<String> strset= new HashSet<>();
        for(String ele:nums)strset.add(ele);

        return permutation("",strset,nums[0].length());

    }
    private String permutation(String str,Set<String> set,int len){
        if(str.length()==len){
            if(!set.contains(str))return str;
            return null;
        }
        String left=permutation(str+"0",set,len);
        if(left!=null)return left;

        return permutation(str+"1",set,len);
    }
} 
class optimal_Find_Unique_Binary_String_1980 {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            sb.append(nums[i].charAt(i) == '0' ? '1' : '0');
        }
        return sb.toString();
    }
}
