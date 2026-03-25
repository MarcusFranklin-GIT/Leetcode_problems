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
public class Sum_Root_to_Leaf_Numbers_129 {
    public int sumNumbers(TreeNode root) {
        return DFS(root,0,0);
    }
    private int DFS(TreeNode Node,int sum,int num){
        if(Node ==null)return sum;
        if(Node.left ==null && Node.right==null){
            num*=10;
            num+=Node.val;
            return sum+=num;
        }
        num*=10;
        num+=Node.val;
        return DFS(Node.left,sum , num)+DFS(Node.right, sum,num);
    }
}