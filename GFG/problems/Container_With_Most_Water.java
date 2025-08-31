// package problems;

public class Container_With_Most_Water {
    public static void main(String[] args) {
        Solution sol=new Solution();
        int arr1[]={2, 1, 8, 6, 4, 6, 5, 5};
        int arr2[] = {1, 5, 4, 3};
        System.out.println(sol.maxWater(arr1));
        System.out.println(sol.maxWater(arr2));
    }
    
}
class Solution {

    public int maxWater(int arr[]) {
        // Code Here
        int i=0,j=arr.length-1;
        int max=0;
        while(i<j){
            if((Math.min(arr[i],arr[j])*(j-i))>max){
                max=Math.min(arr[i],arr[j])*(j-i);
            }
            if(arr[i]<arr[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
}