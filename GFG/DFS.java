import java.util.ArrayList;

class Solution {
    // Function to return a list containing the DFS traversal of the graph.
       
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        int size=adj.size();
        ArrayList<Integer> DFS= new ArrayList<>();
        boolean visited[]=new boolean[size];
     
        visited[0]=true;
        depth(0,visited,DFS,adj);
        return DFS;
        
    }
    
    public static void depth(int node,boolean visited[],ArrayList<Integer> DFS,ArrayList<ArrayList<Integer>> adj){
        visited[node]=true;
        DFS.add(node);
        
        for(int it:adj.get(node)){
            if(visited[it]==false){
                depth(it,visited,DFS,adj);
            }
        }
    }
}