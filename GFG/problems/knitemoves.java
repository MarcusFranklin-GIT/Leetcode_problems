package problems;
import java.util.*;
public class knitemoves {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution sol = new Solution();
        ArrayList<ArrayList<Integer>> ans = sol.knightTour(n);
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
    public static int diff[][]={{2,1},{-2,1},{2,-1},{-2,-1},{1,2},{-1,2},{1,-2},{-1,-2}};
    public ArrayList<ArrayList<Integer>> knightTour(int N) {
        // code here
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        for(int i=0;i<N;i++){
            ArrayList<Integer> rows=new ArrayList<>();
            for(int j=0;j<N;j++){
                rows.add(-1);
            }
            result.add(rows);
        }
        result.get(0).set(0,0);
        if(fill(0,0,result,N,1)){
            return result;
        }
        return new ArrayList<ArrayList<Integer>>();
    }
    public static boolean fill(int row,int col,ArrayList<ArrayList<Integer>> result,int N,int step){
        if(step==N*N)return true;
        for(int dir[]:diff){
            int adjR=row+dir[0];
            int adjC=col+dir[1];
            if(adjR>=0 && adjR<N && adjC>=0 && adjC<N && result.get(adjR).get(adjC)==-1){
                result.get(adjR).set(adjC,step);
                if(fill(adjR,adjC,result,N,step+1)){
                    return true;
                }
                result.get(adjR).set(adjC,-1);
            }
        }
        return false;
    }
}