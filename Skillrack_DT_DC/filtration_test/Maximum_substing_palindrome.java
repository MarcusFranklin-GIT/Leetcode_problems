package filtration_test;
import java.util.*;
public class Maximum_substing_palindrome {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String S=sc.nextLine();
        int len=S.length();
        int arr[][]=new int[len][len];
        for(int i=0;i<len;i++){
            arr[i][i]=1;
        }
        int maxlen=1;
        for(int col=2;col<=len;col++){
            for(int row=0;row<=len-col;row++){
                if(S.charAt(row)==S.charAt(row+col-1)){
                    if(col<=3){
                        arr[row][row+col-1]=1;
                        maxlen=2;
                    }else if(arr[row+1][row+col-2]==1){
                        arr[row][row+col-1]=1;
                    }
                    if(arr[row][row+col-1]==1){
                        maxlen=Math.max(maxlen, col);
                        System.out.print(maxlen+" "); 
                    }
                }else{
                    arr[row][row+col-1]=0;
                    
                }
            }
        }
        System.out.print(maxlen);
    }
}


