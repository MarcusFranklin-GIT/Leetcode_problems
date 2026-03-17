import java.util.HashMap;
import java.util.Stack;
public class Next_Greater_Element_I_496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();

        Stack<Integer> stk=new Stack<>();

        for(int i=nums2.length-1;i>=0;i--){
            while(!stk.isEmpty() && nums2[i]>=stk.peek()){
                stk.pop();
            }
            if(!stk.isEmpty()){
                map.put(nums2[i],stk.peek());
            }else{
                map.put(nums2[i],-1);
            }
            stk.add(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            nums1[i]=map.get(nums1[i]);
        }
        return nums1;
    }
}