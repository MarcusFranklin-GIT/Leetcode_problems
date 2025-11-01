// package Binary tree;
import java.util.*;
public class topview {
    
}
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}

class Solution {
    public ArrayList<Integer> topView(Node root) {
        // code here
        TreeMap<Integer,Integer> TM=new TreeMap<>();
        Queue<Element>  Q = new LinkedList<>();
        
        Q.add(new Element(0,root));
        while(!Q.isEmpty()){
            int size=Q.size();
            while(size-->0){
                
                Element curr=Q.poll();
                int Line=curr.lineno;
                if(TM.get(Line)==null)TM.put(Line,curr.node.data);
                
                if(curr.node.left!=null){
                    Q.add(new Element(Line-1,curr.node.left));
                }
                if(curr.node.right!=null){
                    Q.add(new Element(Line+1,curr.node.right));
                }
            }
        }
        ArrayList<Integer> top = new ArrayList<>();
        for(int key:TM.keySet()){
            top.add(TM.get(key));
        }
        return top;
    }
}
class Element{
    int lineno;
    Node node;
    Element(int L,Node node){
        lineno=L;
        this.node=node;
    }
}