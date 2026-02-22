package Leetcode.Medium;
import java.util.Stack;
class Minimum_Remove_to_Make_Valid_Parentheses_1249 {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stk=new Stack<>();

        for(int i=0;i<s.length();i++){

            if(s.charAt(i)-'a'>=0 &&s.charAt(i)-'a'<=26 )continue;

            if(stk.isEmpty() || s.charAt(i)=='('){
                stk.add(i);
            }else{
                if(s.charAt(stk.peek())=='('){
                    stk.pop();
                }else{
                    stk.add(i);
                }
            }
        }
        StringBuilder result=new StringBuilder(s);
        while(!stk.isEmpty()){
            result.deleteCharAt(stk.pop());
        }

        return result.toString();
    }
}