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
package Leetcode.Easy;
public class Path_Sum_112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        int currsum=0;
        boolean state=false;

        return dfs(root,targetSum,currsum,state);
    }

    public boolean dfs(TreeNode root,int targetsum, int currsum,boolean state){
        if(root.right==null && root.left==null){
            if(targetsum==currsum+root.val) return true;
            else return false;
        }
        if(root.left!=null && state!=true){
           state=dfs(root.left,targetsum,currsum+root.val,state);
        }
        if(root.right!=null && state!=true){
           state=dfs(root.right,targetsum,currsum+root.val,state);
        }
        return state;

    }
}