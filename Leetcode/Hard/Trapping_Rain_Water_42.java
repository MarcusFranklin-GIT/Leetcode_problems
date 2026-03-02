public class Trapping_Rain_Water_42 {
    public int trap(int[] height) {
        int water=0;
        int blocks=0;

        int left=0,right=1;

        while(right<height.length){
            if(height[left]<=height[right]){
                water+=(height[left]*(right-left-1))-blocks;
                blocks=0;
                left=right;
            }else{
                blocks+=height[right];
            }
                right++;
        }
        int stop=left;

        left=height.length-2;
        right=height.length-1;
        blocks=0;
        
        while(left>=stop){
            if(height[right]<=height[left]){
                water+=(height[right]*(right-left-1))-blocks;
                blocks=0;
                right=left;
            }else{
                blocks+=height[left];
            }
                left--;
        }

        return water;
    }
}