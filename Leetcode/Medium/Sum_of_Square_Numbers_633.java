package Leetcode.Medium;
class Sum_of_Square_Numbers_633 {
    public boolean judgeSquareSum(int c) {
        long left=0,right=(int)Math.sqrt(c);
        while(left<=right){
            long sum=(left*left)+(right*right);
            if(sum==c)return true;
            else{
                if(sum<c)left++;
                else right--;
            }

        }
        return false;
    }
}