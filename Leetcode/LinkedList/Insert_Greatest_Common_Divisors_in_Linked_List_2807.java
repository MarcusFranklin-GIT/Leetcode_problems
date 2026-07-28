/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Insert_Greatest_Common_Divisors_in_Linked_List_2807 {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null || head.next == null)return head;
        ListNode curr = head;
        ListNode Next = curr.next;

        while(curr.next != null){
            ListNode newnode = new ListNode(gcd(curr.val,Next.val));
            curr.next = newnode;
            newnode.next = Next;
            curr=Next;
            Next=Next.next;
        }
        return head;
    }

    public static int gcd(int a,int b){
        return (b==0)?a:gcd(b,a%b);
    }
}