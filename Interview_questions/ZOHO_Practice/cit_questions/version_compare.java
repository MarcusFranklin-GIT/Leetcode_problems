class Solution {
    public int compareVersion(String version1, String version2) {
        int i = 0, j = 0;
        int n = version1.length(), m = version2.length();
        
        while (i < n || j < m) {
            int num1 = 0;
            while (i < n && version1.charAt(i) != '.') {
                num1 = num1 * 10 + (version1.charAt(i) - '0');
                i++;
            }
            int num2 = 0;
            while (j < m && version2.charAt(j) != '.') {
                num2 = num2 * 10 + (version2.charAt(j) - '0');
                j++;
            }
            
            if (num1 != num2) {
                return num1 < num2 ? -1 : 1;
            }
            
            i++; // skip the dot
            j++;
        }
        
        return 0;
    }
}

public class version_compare {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        String version1 = "1.0.1";
        String version2 = "1.001.0";
        
        int result = solution.compareVersion(version1, version2);
        System.out.println("Comparison Result: " + result); // Output: 1
    }
}