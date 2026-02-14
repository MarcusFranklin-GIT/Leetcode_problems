package Leetcode.LinkedList.Binarytree;

import java.util.*;

public class Binary_Tree_Right_Side_View_199 {
    List<Integer> arr=new ArrayList<>();
    int max=0;
    public List<Integer> rightSideView(TreeNode root) {
        right(1,root);
        return arr;
    }
    void right(int temp,TreeNode node){
        if(node==null)return;
        if(temp>max){
            max=temp;
            arr.add(node.val);
        }
        right(temp+1,node.right);
        right(temp+1,node.left);
    }
}



//   Definition for a binary tree node.
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