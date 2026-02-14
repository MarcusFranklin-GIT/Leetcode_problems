// class Solution {
//     public String largestGoodInteger(String num) {
//         String []nums={"999","888","777","666","555","444","333","222","111","000"};
//         for(String i:nums){
//             if(num.contains(i))return i;
//         }
//         return "";
//     }
// }
package Leetcode.Easy;
public class Largest_3_Same_Digit_Numberin_String_2264 {
    public String largestGoodInteger(String num) {
        String maxGood = "";
        for (int i = 0; i <= num.length() - 3; i++) {
            char c = num.charAt(i);
            if (c == num.charAt(i+1) && c == num.charAt(i+2)) {
                String candidate = num.substring(i, i+3);
                if (candidate.compareTo(maxGood) > 0) {
                    maxGood = candidate;
                }
            }
        }
        return maxGood;
    }
}
