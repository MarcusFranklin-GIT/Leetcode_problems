import java.util.Arrays;
public class Maximum_Element_After_Decreasing_and_Rearranging_1846 {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        arr[0]=1;
        for(int i = 1 ; i<arr.length ; i++){
            if(arr[i]>arr[i-1]+1)arr[i]=arr[i-1]+1;
        }
        return arr[arr.length-1];
    }
}