
package Leetcode.LinkedList;
public class Rotate_LL_61 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null)return head;
        int count=1;
        ListNode x=head;
        while(x.next!=null){
            count++;
            x=x.next;
        }
        int num=k%count;
        while(num>0){
            ListNode ptr=head;
            ListNode preptr=null;;
            while(ptr.next!=null){
                preptr=ptr;
                ptr=ptr.next;
            }
            preptr.next=null;
            ptr.next=head;
            head=ptr;
            num--;

        }
        return head;
    }
}