import java.util.Stack;
public class Clear_Digits_3174 {
    public String clearDigits(String s) {
        Stack<Character> stk= new Stack<>();
        for(char ch : s.toCharArray()){
            
            if(ch >= 'a' && ch<='z')stk.push(ch);
            else{
                if(!stk.isEmpty())stk.pop();
            }
        }
        int n = stk.size();
        char[] arr = new char[n];
        for(int i = n - 1; i >= 0; i--){
            arr[i] = stk.pop();
        }
        return new String(arr);
    }
}