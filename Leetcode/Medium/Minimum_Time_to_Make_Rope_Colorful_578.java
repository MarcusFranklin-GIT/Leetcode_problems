package Leetcode.Medium;
import java.util.*;

public class Minimum_Time_to_Make_Rope_Colorful_578 {
    public static void main(String[] args) {
        Solution sol=new Solution();
        String colors="abaac";
        int neededTime[]={1,2,3,4,5};
        System.out.println(sol.minCost(colors, neededTime));
    }
}
class Solution {
    public int minCost(String colors, int[] neededTime) {
        int total=neededTime[0];
        int maxtime=total;
        int time=0;
        for(int i=1;i<colors.length();i++){
            if(colors.charAt(i)==colors.charAt(i-1)){
                total+=neededTime[i];
                maxtime=Math.max(maxtime,neededTime[i]);
            }else{
                    time+=total-maxtime;
                    total=neededTime[i];
                    maxtime=total;
            }
        }
        time+=total-maxtime;
        return time;
    }
}