package Leetcode.LinkedList;

class Reverse_Linked_List_206 {
    public ListNode reverseList(ListNode head) {
        if(head==null)return null;
        ListNode ans=null;
        ListNode ptr=head;
        while(ptr!=null){
            ListNode newnode = ptr;    
            ptr = ptr.next;             
            newnode.next = ans;  
            ans = newnode;   
        }
        return ans;
    }
}

//Definition for singly-linked list.
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }