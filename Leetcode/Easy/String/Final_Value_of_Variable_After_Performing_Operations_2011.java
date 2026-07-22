public class Final_Value_of_Variable_After_Performing_Operations_2011 {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(String op:operations){
            if(op.charAt(1)=='+') x++;
            if(op.charAt(1)=='-') x--;
        }
        return x;
    }
}