package problems;

import java.util.*;

public class Steps_by_Knight {
    
}
class Solution {
    public int minStepToReachTarget(int knightPos[], int targetPos[], int n) {
        // Code here
        if(Arrays.equals(knightPos,targetPos))return 0;
        Queue<int[]> Q=new LinkedList<>();
        int row=knightPos[0];
        int col=knightPos[1];
        Q.add(new int[]{row,col});
        boolean visited[][]=new boolean[n+1][n+1];
        visited[row][col]=true;
        int days=0;
        while(!Q.isEmpty()){
            int size=Q.size();
            while(size-->0){
                int pos[]=Q.poll();
                if(adjacent(n,targetPos,pos,visited,Q)){
                    return days+1;
                }
            }
            days++;
        }
        return -1;
    }
    
    public static boolean adjacent(int N,int[] T,int pos[],boolean visited[][],Queue<int[]> Q){
        int diff[][]={{1,2},{2,1},{-1,-2},{-2,-1},{1,-2},{-1,2},{2,-1},{-2,1}};
        for(int dir[]:diff){
            int adjR=pos[0]+dir[0];
            int adjC=pos[1]+dir[1];
            if(adjR<=N && adjC<=N && adjR>0 && adjC>=0 && !visited[adjR][adjC]){
              if(adjR==T[0] && adjC==T[1]){
                  return true;
              }
              Q.add(new int[]{adjR,adjC});
              visited[adjR][adjC]=true;
            }
        }
        return false;
    }
}