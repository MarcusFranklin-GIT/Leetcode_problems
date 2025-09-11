package Leetcode.LinkedList;

// Definition for singly-linked list.
class Remove_Nth_Node_From_End_of_List_19 { 
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)return null;
        ListNode root= new ListNode(0, head);
        ListNode fast=root;
        ListNode slow=root;
        for(int i=0;i<=n;i++){
            fast=fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next=slow.next.next;

        return root.next;
    }
     public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
    ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
}