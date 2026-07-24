public class Score_of_a_String_3110 {
    public int scoreOfString(String s) {
        int sum=0;
        for(int  i = 0;i<s.length()-1;i++){
            int num1 = s.charAt(i)-'a';
            int num2 = s.charAt(i+1)-'a';
            sum+=Math.abs(num1-num2);
        }
        return sum;
    }
}
