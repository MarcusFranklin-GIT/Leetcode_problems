package Leetcode.LinkedList;
 
class Rotate_List_61 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null|| k==0)return head;

        ListNode tail=head;
        int length=1;
        while(tail.next!=null){
            tail=tail.next;
            length++;
        }
        tail.next=head;
        ListNode newtail=head;
        int len=length-(k%length);
        for(int i=1;i<len;i++){
            newtail=newtail.next;
        }
        head=newtail.next;
        newtail.next=null;
        return head;
    }
}
//to rotate the linked list to the right by k places
//Approach: first find the length of the linked list
//then connect the tail to the head to make it circular
//then find the new tail which is at length-(k%length) position 
//then break the circular link by setting newtail.next to null
//return the new head which is newtail.next