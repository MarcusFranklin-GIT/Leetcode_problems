package Leetcode.Easy;
//mohan solution
public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

class Balanced_Binary_Tree_110 {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int left = height(root.left);
        int right = height(root.right);
        return (Math.abs(left - right) <= 1) && isBalanced(root.left) && isBalanced(root.right);
    }

    private static int height(TreeNode root) {
        if (root == null) return 0; 
        return 1 + Math.max(height(root.left), height(root.right));
    }
//my solution
    // public boolean isBalanced(TreeNode root) {
    //     if(root==null)return true;
    //     Queue<TreeNode> Q=new LinkedList<>();
    //     Q.add(root);
    //     while(!Q.isEmpty()){
    //         TreeNode node=Q.poll();
    //         if(node.left!=null)Q.add(node.left);
    //         if(node.right!=null)Q.add(node.right);
    //         if(Math.abs(height(node.left)-height(node.right))>1)return false;
    //     } 
    //     return true;
    // }

    // public int height(TreeNode node){
    //     if(node==null)return 0;
    //     return Math.max(height(node.left),height(node.right))+1;
    // }
}