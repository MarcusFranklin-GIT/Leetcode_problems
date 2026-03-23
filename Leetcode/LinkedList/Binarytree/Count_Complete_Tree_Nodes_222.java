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
public class Count_Complete_Tree_Nodes_222 {
    public int countNodes(TreeNode root) {
        if(root ==null )return 0;

        int leftHeight  = Lheight(root);
        int rightHeight = Rheight(root);

        if(leftHeight == rightHeight){
            return (1 << leftHeight ) - 1;
        }

        return 1 + countNodes(root.left)+countNodes(root.right);
    }
    private static int Lheight(TreeNode node){
        int height=0;
        while(node != null){
            height++;
            node=node.left;
        }
        return height;
    }
    
    private static int Rheight(TreeNode node){
        int height=0;
        while(node != null){
            height++;
            node=node.right;
        }
        return height;
    }
}