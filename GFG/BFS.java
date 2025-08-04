import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int S=adj.size();
        ArrayList<Integer> B=new ArrayList<>();
        Queue<Integer> Q=new LinkedList<>();
        boolean visited[]=new boolean[S];
        
        Q.add(0);
        visited[0]=true;
        
        while(!Q.isEmpty()){
            
            int node =Q.poll();
            B.add(node);
            
            for(int it:adj.get(node)){
                if(visited[it]==false){
                    visited[it]=true;
                    Q.add(it);
                }
            }
        }
        return B;
    }
}