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
public class Binary_Tree_Postorder_Traversal_145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result= new LinkedList<>();
        
        if(root == null)return result;

        traverse(root.left,result);
        traverse(root.right,result);
        result.add(root.val);

        return result;
    }
    private static void traverse(TreeNode node,List<Integer> result){
        if(node == null)return;

        traverse(node.left,result);
        traverse(node.right,result);
        result.add(node.val);
    }
}