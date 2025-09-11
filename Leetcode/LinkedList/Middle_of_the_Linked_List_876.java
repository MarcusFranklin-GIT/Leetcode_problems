package Leetcode.LinkedList;
//  * Definition for singly-linked list.
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
class Middle_of_the_Linked_List_876 {
    public ListNode middleNode(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
}

//to find the middle node of linked list
//if there are two middle nodes return the second middle node
//Approach: use two pointers fast and slow
//move fast pointer two steps and slow pointer one step
//when fast pointer reaches the end slow pointer will be at the middle node
//return the slow pointer
