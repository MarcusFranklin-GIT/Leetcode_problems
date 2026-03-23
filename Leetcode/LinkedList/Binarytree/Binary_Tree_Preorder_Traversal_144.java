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
import java.util.*;
public class Binary_Tree_Preorder_Traversal_144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result= new LinkedList<>();
        
        if(root == null)return result;

        result.add(root.val);
        traverse(root.left,result);
        traverse(root.right,result);

        return result;
    }
    private static void traverse(TreeNode node,List<Integer> result){
        if(node == null)return;

        result.add(node.val);
        traverse(node.left,result);
        traverse(node.right,result);
    }
}