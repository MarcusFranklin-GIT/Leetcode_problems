import java.util.Stack;
public class Evaluate_Reverse_Polish_Notation_150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk=new Stack<>();

        for(String str : tokens){
            if(str.equals("+")){
                int a=stk.pop();
                int b=stk.pop();
                stk.push(a+b);

            }else if(str.equals("-")){
                int a=stk.pop();
                int b=stk.pop();
                stk.push(b-a);
            }else if(str.equals("*")){
                int a=stk.pop();
                int b=stk.pop();
                stk.push(a*b);
            }else if(str.equals("/")){
                int a=stk.pop();
                int b=stk.pop();
                stk.push(b/a);
            }else {
                stk.push(Integer.parseInt(str));
            }
        }
        return stk.pop();
    }
}