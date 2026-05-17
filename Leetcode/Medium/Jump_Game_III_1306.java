public class Jump_Game_III_1306 {
    public boolean canReach(int[] arr, int start) {
        boolean visited[] = new boolean[arr.length];
        return helper(start,arr,visited);
    }
    public boolean helper(int index,int[] arr ,boolean visited[]){
        if(index<0 || index>=arr.length) return false;
        if(visited[index])return false;
        if(arr[index]==0)return true;

        visited[index]=true;

        if(helper(index+arr[index],arr,visited)||helper(index-arr[index],arr,visited)){
             return true;
        }

        visited[index]=false;
        return false;
    }
}
