public class Move_All_Zeroes_to_End {
    void pushZerosToEnd(int[] arr) {
        // code here
        int left=0,right=0;
        while(right<arr.length){
            if(arr[right]!=0){
                swap(left,right,arr);
                right++;
                left++;
            }else{
                right++;
            }
        }
    }
    void swap(int left,int right,int[]arr){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
}