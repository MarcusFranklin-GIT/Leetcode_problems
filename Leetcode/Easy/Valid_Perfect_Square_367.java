package Leetcode.Easy;
class Valid_Perfect_Square_367 {
    public boolean isPerfectSquare(int num) {
        if(num<=1)return true;
        long left=2,right=num/2;
        while(left<=right){
            long mid=left+(right-left)/2;
            if(mid*mid==num)return true;
            if(mid*mid<num)left=mid+1;
            else right=mid-1;
        }
        return false;
    }
}