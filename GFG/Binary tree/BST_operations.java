
import java.util.*;

public class BST_operations {
    static class Node{
        int data;
        Node left,right;
        Node(int d){
            data=d;
            left = right = null;
        }
    }
    static Node head;
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        head=null;
        for(int i=0;i<N;i++){
            int q=sc.nextInt();
            if(q==1){
                int val=sc.nextInt();
                head=insert(head,val);
            }else if(q==2){
                int val=sc.nextInt();
                if(search(head,val))head=delete(head,val);
            }else if(q==3){
                int val=sc.nextInt();
                System.out.println(search(head,val));
            }
            else if(q==4){
                print(head);
            }
        }
    }
    //method to insert a node in BST
    static Node insert(Node node,int val){
        if(node==null){
            return new Node(val);
        }else if(node.data<val){
            node.right=insert(node.right,val);
        }else if(node.data>val){
            node.left=insert(node.left,val);
        }
        return node;

    }
    // method to print the BST
    static void print(Node node){
        if(node==null)return;
        System.out.print(node.data+":");
        if(node.left!=null)System.out.print("L:"+node.left.data+",");
        if(node.right!=null)System.out.print("R:"+node.right.data);
        System.out.println();
        print(node.left);
        print(node.right);
    }
    // method to search a value in BST
    static boolean search(Node node,int val){
        if(node==null)return false;
        else if(node.data==val)return true;
        else if(node.data>val)return search(node.left,val);
        else return search(node.right,val);
    }
    // method to delete a node from BST
    static Node delete(Node node,int val){
        if(node==null)return null;
        else if(node.data<val){
            node.right=delete(node.right,val);
        }else if(node.data>val){
            node.left=delete(node.left,val);
        }else{
            if(node.left==null && node.right==null)return null;
            else if(node.left==null)return node.right;
            else if(node.right==null)return node.left;
            else{
                int min=findmin(node.right);
                node.data=min;
                node.right=delete(node.right,min);
            }
        }
        return node;
    }
    static int findmin(Node node){
        while(node.left!=null){
            node=node.left;
        }
        return node.data;
    }
}

// this program performs insertion ,deletion ,search ,printing of a binary search tree
