//  * Definition for singly-linked list.
   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class Reverse_Nodes_in_k_Group_25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        
        ListNode temp=head;
        for(int i=0;i<k;i++){
            if(temp == null)return head;
            temp=temp.next;
        }

        ListNode prev = null;
        ListNode next = null;
        ListNode current = head;

        int count=0;

        while(current != null && count<k){
            next = current.next;
            current.next=prev;
            prev=current;
            current= next;
            count++;
        }

        head.next=current;
        head.next = reverseKGroup(current,k);

        return prev;
    }
}