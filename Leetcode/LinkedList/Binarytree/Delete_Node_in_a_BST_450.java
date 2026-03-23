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
public class Delete_Node_in_a_BST_450 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)return root;

        if(root.val<key){

            root.right = deleteNode(root.right , key);

        }else if(root.val>key){

            root.left = deleteNode(root.left , key);

        }else if(root.val == key){
            if(root.left == null && root.right==null)return null;

            else if(root.left == null)return root.right;

            else if(root.left == null)return root.left;

            else{
                if(root.right!=null){
                int a = minimum(root.right);
                root.val=a;
                root.right = deleteNode(root.right,a);
                }
                else{
                    int a=maximum(root.left);
                    root.val=a;
                    root.left =deleteNode(root.left, a);
                }
            }
        }
        return root;
    }

    private static int minimum(TreeNode node){
        while(node.left !=null){
            node = node.left;
        }
        return node.val;
    }

    private static int maximum(TreeNode node){
        while(node.right != null){
            node =node.right;
        }
        return node.val;
    }
}