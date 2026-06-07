import java.util.*;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Create_Binary_Tree_From_Descriptions_2196 {
    public TreeNode createBinaryTree(int[][] descriptions) {
        
        HashMap<Integer,int[]> Nodes = new HashMap<>();
        Set<Integer> children = new HashSet<>();

        for(int[] description:descriptions){
            int val=description[0];
            if(Nodes.get(val)==null){
                int arr[] = new int[2];
                arr[description[2]]=description[1];
                Nodes.put(val,arr);
            }else{
                Nodes.get(val)[description[2]]=description[1];
            }
            children.add(description[1]);
        }
        TreeNode root = new TreeNode();
        Queue<TreeNode> queue = new LinkedList<>();
        for(Integer node:Nodes.keySet()){
            if(!children.contains(node)){
                root.val=node;
                queue.add(root);
                break;
            }
        }
        while(!queue.isEmpty()){
            TreeNode currnode=queue.poll();
            if(Nodes.get(currnode.val)!=null){
                int child[] = Nodes.get(currnode.val);
                if(child[0]!=0){
                    TreeNode node = new TreeNode(child[0]);
                    queue.add(node);
                    currnode.right=node;
                }
                if(child[1]!=0){
                    TreeNode node = new TreeNode(child[1]);
                    queue.add(node);
                    currnode.left=node;
                }
            }
        }
        return root;
    }
}