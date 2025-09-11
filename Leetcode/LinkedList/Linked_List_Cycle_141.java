package Leetcode.LinkedList;

public class Linked_List_Cycle_141 {
    public boolean hasCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)return true;
        }
        return false;
    }

//Definition for singly-linked list.
 class ListNode {
     int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
 
}
//to detect if there is a cycle in the linked list
//Approach: use two pointers fast and slow
//move fast pointer two steps and slow pointer one step
//if there is a cycle fast pointer will meet slow pointer
//if there is no cycle fast pointer will reach the end of the list
//return true if there is a cycle else return false