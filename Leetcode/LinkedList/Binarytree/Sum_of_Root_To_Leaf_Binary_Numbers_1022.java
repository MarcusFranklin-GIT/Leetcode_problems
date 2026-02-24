package Leetcode.LinkedList.Binarytree;

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
public class Sum_of_Root_To_Leaf_Binary_Numbers_1022 {
    public int sumRootToLeaf(TreeNode root) {
        if(root==null)return 0;
        return helper(root,0);
    }
    public int helper(TreeNode node,int curr){
        if(node==null)return 0;
        curr=(curr << 1)|node.val;
        if(node.left==null && node.right==null){
            return curr;
        }
        return helper(node.left,curr)+helper(node.right,curr);
    }
}