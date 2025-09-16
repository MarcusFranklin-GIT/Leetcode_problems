
import java.io.*;
import java.util.*;

public class traversals {
    static class Node{
        int data;
        Node left;
        Node right;
        Node (int d){
            data=d;
            left=null;
            right=null;
        }
    }
    static Node Root;
    public static void main(String[] args) {
   
        Scanner sc=new Scanner(System.in);
        int val=sc.nextInt();
        if(val==-1)return;
        Queue<Node> q=new LinkedList<>();
        Node newnode= new Node(val);
        Root=newnode;
        q.add(newnode);
        while(!q.isEmpty()){
            Node curr=q.poll();
            int val1=sc.nextInt();
            if(val1!=-1){
                curr.left=new Node(val1);
                q.add(curr.left);
            }
            int val2=sc.nextInt();
            if(val2!=-1){
                curr.right=new Node(val2);
                q.add(curr.right);
            }
        }
        inorder(Root);
        System.out.println();
        preorder(Root);
        System.out.println();
        post(Root);
        System.out.println();
        level(Root);
    }
    static void inorder(Node node){
        if(node==null)return;
        inorder(node.left);
        System.out.print(node.data+" ");
        inorder(node.right);
    }
    // in,pre,post,level
    static void preorder(Node node){
        if(node==null)return;
        System.out.print(node.data+" ");
        preorder(node.left);
        preorder(node.right);
    }
    static void post(Node node){
        if(node==null)return;
        post(node.left);
        post(node.right);
        System.out.print(node.data+" ");
    }
    static void level(Node node){
        Queue<Node> q=new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()){
            Node curr=q.poll();
            System.out.print(curr.data+" ");
            if(curr.left!=null)q.add(curr.left);
            if(curr.right!=null)q.add(curr.right);
        }
    }
}