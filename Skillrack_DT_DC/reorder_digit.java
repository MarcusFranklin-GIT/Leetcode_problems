
import java.util.*;
public class reorder_digit {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        long N=sc.nextLong();
        long A=sc.nextLong();
//find length        
        long num=N;
        int len=0;
        while(num>0){
            len++;
            num/=10;
        }

        
        boolean isused[]=new boolean[len];
        List<String> res=new ArrayList<>();
        helper(isused,res,new StringBuilder(),String.valueOf(N).toCharArray(),len);
        Long ans=Long.MAX_VALUE;
        for(String S:res){
            if(A<=(Long.parseLong(S))){
               ans=Math.min(ans,Long.parseLong(S));
            }
        }
        System.out.print(ans);
    }
    
    public static void helper(boolean isused[],List<String> res,StringBuilder current,char digits[],int len){
       
        if(current.length()==digits.length){
            res.add(current.toString());
        }
        for(int i=0;i<len;i++){
            if(!isused[i]){
                isused[i]=true;
                current.append(digits[i]);
                helper(isused,res,current,digits,len);
                isused[i]=false;
                current.deleteCharAt(current.length()-1);
            }
        }
        
        
    }
}

// This code generates all permutations of the digits of a number N and finds the smallest permutation that is greater than a given number A.
// It uses backtracking to explore all possible arrangements of the digits and stores valid permutations in a list.
// The final result is the smallest permutation that is greater than A, or Long.MAX_VALUE if no such permutation exists.