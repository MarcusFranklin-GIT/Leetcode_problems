
  //Definition for a binary tree node.
// class TreeNode {
//       int val;
//       TreeNode left;
//       TreeNode right;
//       TreeNode() {}
//       TreeNode(int val) { this.val = val; }
//       TreeNode(int val, TreeNode left, TreeNode right) {
//           this.val = val;
//           this.left = left;
//           this.right = right;
//       }
//   }
import java.util.*;
public class Binary_Tree_Inorder_Traversal_94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> order=new ArrayList<>();
        helper(root,order);
        return order;

    }
    public void helper(TreeNode root,ArrayList<Integer> order){
        if(root==null)return;
        helper(root.left,order);
        order.add(root.val);
        helper(root.right,order);
    }
}