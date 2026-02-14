package Leetcode.Medium;
public class union_find {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        int leader[]=new int[n];
        for(int i=0;i<n;i++){
            leader[i]=i;
        }

        for(int edge[]: edges){
            int x=edge[0]; //6
            int y=edge[1]; //4
            change(leader,x,y);
        }
        for(int i=0;i<n;i++){
            leader[i]=findLeader(leader[i],leader);
        }
        return leader[source]==leader[destination];
    }
    public static void change(int leader[],int x,int y){
        int left=findLeader(x,leader); //6
        int right=findLeader(y,leader); //1
        if(left!=right){
            leader[right]=left; //4=>6
        }
    }

    public static int findLeader(int node,int []leader){
        if(leader[node]==node)return node;
        leader[node]=findLeader(leader[node],leader);
        return leader[node];
    }
}