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
class Merge_Nodes_in_Between_Zeros_2181 {
    public ListNode mergeNodes(ListNode head) {

        ListNode start=null;
        ListNode end=head.next;
        int sum=0;

        while(end!=null){
            if(end.val==0){
                ListNode curr = new ListNode(sum);
                sum=0;
                if(start==null){
                    start=curr;
                    head=start;
                }
                else{
                    start.next = curr;
                    start= start.next;
                }
            }else{
                sum+=end.val;
            }
            end=end.next;
        }
        return head;        
    }
}