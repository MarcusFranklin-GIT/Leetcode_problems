
  class TreeNode {
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

public class Construct_String_from_Binary_Tree_606 {
    public String tree2str(TreeNode root) {
        StringBuilder result = new StringBuilder();
        preorder(root,result);
        return result.toString();

    }

    private void preorder(TreeNode Node, StringBuilder result) {
        if (Node == null)
            return;
        result.append(Node.val);

        if(Node.left==null && Node.right==null)return;

        result.append("(");
        preorder(Node.left,result);
        result.append(")");

        if (Node.right != null) {
            result.append("(");
            preorder(Node.right, result);
            result.append(")");
        }
    }
}