package problems;
import java.util.*;
public class knites_tour_Warnsdorff {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Solution sol=new Solution();
        ArrayList<ArrayList<Integer>> ans=sol.knightTour(n);
        if (ans.size() == 0) {
            System.out.println("[]");
        } else {
            for (ArrayList<Integer> row : ans) {
                System.out.println(row);
            }
        }
    }
}
class Solution {
    public static int diff[][]={{2,1},{2,-1},{1,2},{-1,2},{1,-2},{-1,-2},{-2,1},{-2,-1}};
    public ArrayList<ArrayList<Integer>> knightTour(int n) {
        // code here
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        for(int i=0;i<n;i++){
            ArrayList<Integer> rows=new ArrayList<>();
            for(int j=0;j<n;j++){
                rows.add(-1);
            }
            result.add(rows);
        }
        result.get(0).set(0,0);
        int x=0,y=0;
        
        for(int move=1;move<n*n;move++){
            int mindegree=9;
            int next=-1;
            
            for(int i=0;i<8;i++){
                int adjR=x+diff[i][0];
                int adjC=y+diff[i][1];
                if(checkvalid(adjR,adjC,result,n)){
                    int available=countdegree(adjR,adjC,result,n);
                    if(available<mindegree){
                        mindegree=available;
                        next=i;
                    }
                }
            }
            if(next==-1)return new ArrayList<ArrayList<Integer>>();
            
            x+=diff[next][0];
            y+=diff[next][1];
            result.get(x).set(y,move);
        }
        return result;
        
    }
    public static boolean checkvalid(int row,int col,ArrayList<ArrayList<Integer>>result,int n){
        return (row>=0 && row<n && col>=0 && col<n && result.get(row).get(col)==-1);
    }
    public static int countdegree(int row,int col, ArrayList<ArrayList<Integer>> result,int n){
        int count=0;
        for(int i=0;i<8;i++){
            int adjR=row+diff[i][0];
            int adjC=col+diff[i][1];
            if(checkvalid(adjR,adjC,result,n)){
                count++;
            }
        }
        return count;
    }
}
