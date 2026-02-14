package Leetcode.Medium;
class Interleaving_String_97 {
    public boolean isInterleave(String s1, String s2, String s3) {
        int len1 = s1.length(), len2 = s2.length(), len3 = s3.length();
        if (len1 + len2 != len3)
            return false;
        boolean mat[][] = new boolean[len1][len2];
        int i1 = 0, i2 = 0, i3 = 0;
        return helper(s1, s2, s3, i1, i2, i3, len1, len2, len3, mat);
    }

    public boolean helper(String s1, String s2, String s3, int i1, int i2, int i3, int len1, int len2, int len3,
            boolean mat[][]) {
        if (i3 == len3)
            return true;
        if ((i1 < len1 && i3 < len3 && i2 < len2) && s1.charAt(i1) == s2.charAt(i2) && s1.charAt(i1) == s3.charAt(i3)
                && mat[i1][i2] != true) {
            boolean result = helper(s1, s2, s3, i1 + 1, i2, i3 + 1, len1, len2, len3, mat);
            if (result)
                return true;
            mat[i1][i2] = true;
            return helper(s1, s2, s3, i1, i2 + 1, i3 + 1, len1, len2, len3, mat);
        }

        if (i1 < len1 && s1.charAt(i1) == s3.charAt(i3)) {
            return helper(s1, s2, s3, i1 + 1, i2, i3 + 1, len1, len2, len3, mat);
        }

        if (i2 < len2 && s2.charAt(i2) == s3.charAt(i3)) {
            return helper(s1, s2, s3, i1, i2 + 1, i3 + 1, len1, len2, len3, mat);
        }
        return false;
    }
}