package Leetcode.Easy;  
import java.util.*;

public class Kids_With_the_Greatest_Number_of_Candies_1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result=new ArrayList<>();
        int max=0;
        for(int cand:candies)max=Math.max(max,cand);
        for(int i=0;i<candies.length;i++)result.add((candies[i]+extraCandies)>=max);
        return result;
    }
}