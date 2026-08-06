public class Minimum_Number_of_Operations_to_Move_All_Balls_to_Each_Box_1769{
    public int[] minOperations(String boxes) {

        int len = boxes.length();
        int result[] = new int[len];
        int front=0,rear=0;

        int fmoves=0,rmoves=0;

        for(int i=0;i<len ; i++){

            if(i>0){
                result[i]+=fmoves;
                result[len-i-1]+=rmoves;
            }

            if(boxes.charAt(i)=='1')front++;
            if(boxes.charAt(len-i-1)=='1')rear++;
            fmoves+=front;
            rmoves+=rear;
        }
        
        return result;
    }
}