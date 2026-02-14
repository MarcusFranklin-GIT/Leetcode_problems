package Leetcode.Easy;
import java.util.*;
public class Valid_Parentheses_20 {
    public boolean isValid(String s) {
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(stk.isEmpty()){
                stk.add(s.charAt(i));
            }else{
                if(s.charAt(i)==')' && stk.peek()=='(')stk.pop();
                else if(s.charAt(i)=='}' && stk.peek()=='{')stk.pop();
                else if(s.charAt(i)==']' && stk.peek()=='[')stk.pop();
                else stk.add(s.charAt(i));
                }
            }
            return stk.isEmpty();
    }
}