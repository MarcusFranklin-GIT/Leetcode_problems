package Leetcode.LinkedList;

public class Reverse_Linked_List_206 {
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
