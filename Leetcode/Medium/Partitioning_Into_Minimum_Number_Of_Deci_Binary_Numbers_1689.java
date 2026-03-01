public class Partitioning_Into_Minimum_Number_Of_Deci_Binary_Numbers_1689 {
    public int minPartitions(String n) {
        int len=n.length();
        int max=0;
        for(int i=0;i<len;i++){
            max=Math.max(n.charAt(i)-'0',max);
        }
        return max;
    }
}