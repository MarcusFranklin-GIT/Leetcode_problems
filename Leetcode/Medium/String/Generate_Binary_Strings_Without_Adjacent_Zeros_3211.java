import java.util.*;
public class Generate_Binary_Strings_Without_Adjacent_Zeros_3211 {
    List<String> result ;
    public List<String> validStrings(int n) {
        result = new ArrayList<>();
        check("",n);
        return result;
    }
    private void check(String str,int n){
        int len = str.length();
        if(len==n){
            result.add(str);
            return;
        }
        if(len!=0 && str.charAt(len-1)=='0'){
            check(str+"1",n);
        }else{
            check(str+"0",n);
            check(str+"1",n);
        }
    }
}