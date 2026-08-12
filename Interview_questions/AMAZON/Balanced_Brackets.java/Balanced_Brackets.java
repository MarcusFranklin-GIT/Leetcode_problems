
public class Balanced_Brackets {
    public static String isBalanced(String s) {
    // Write your code here
        while(true){
            if(s.contains("()")){
                s = s.replace("()","");
            }else if(s.contains("[]")){
                s = s.replace("[]","");
            }else if(s.contains("{}")){
                s = s.replace("{}","");
            }else{
                if(s.isEmpty()){
                    return "YES";
                }else{
                    return "NO";
                }
            }
        }
    }
}
