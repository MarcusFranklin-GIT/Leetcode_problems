package Leetcode.Medium.Graph;

import java.util.LinkedList;
import java.util.Queue;

public class Number_of_Provinces_547 {

    //BFS Solution
    public int numProvinces(int[][] adj) {
        int V = adj.length;
        boolean visited[] = new boolean[V];

        Queue<Integer> Q = new LinkedList<>();
        int cnt=0;
        for(int i=0;i<V;i++){
            if(visited[i])continue;
            cnt++;
            Q.add(i);
            while(!Q.isEmpty()){
                int curr = Q.poll();

                visited[curr] =true;

                for(int j=0; j<V ;j++){
                    if(adj[curr][j]==1 && !visited[j]){
                    Q.add(j);
                    visited[j] = true;
                    }
                }
            }
        }
        return cnt;
    }


    //DFS solution 
    int findCircleNum(int[][] isConnected) {
        int N=isConnected.length,provences=0;
        boolean visited[]=new boolean[N];
        
        for(int city=0;city<N;city++){
            if(!visited[city]){
                provences++;
                dfs(N,city,isConnected,visited);
            }
        }
        return provences;
    }
    public void dfs(int N,int city,int isConnected[][],boolean visited[]){
          visited[city] = true;
          for(int othcity = 0; othcity<N; othcity++){
            if(!visited[othcity] && isConnected[city][othcity] == 1){
                dfs(N, othcity, isConnected, visited);
            }
        }

    }
}
