package Leetcode.Easy;
class Kth_Missing_Positive_Number {
    public int findKthPositive(int[] arr, int k) {
        int len=arr.length;
        int left=0,right=len-1,mid=0;
        while(left<=right){
            mid=(right+left)/2;
            if((arr[mid]-(mid+1))>=k)right=mid-1;
            else left=mid+1;
        }
        return right+k+1;
    }
}
//brute force
// class Solution {
//     public int findKthPositive(int[] arr, int k) {
//         for (int i = 0; i < arr.length; i++) {
            
//             if (arr[i] <= k) {
//                 k++;  
//             } else {
//                 break;
//             }
//         }
//         return k;
//     }
// }