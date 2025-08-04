class Solution {
    public Middle_of_the_Linked_List middleNode(Middle_of_the_Linked_List head) {
        Middle_of_the_Linked_List fast=head;
        Middle_of_the_Linked_List slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
}

public class Middle_of_the_Linked_List{
     int val;
      Middle_of_the_Linked_List next;
     Middle_of_the_Linked_List() {}
     Middle_of_the_Linked_List(int val) { this.val = val; }
      Middle_of_the_Linked_List(int val, Middle_of_the_Linked_List next) { this.val = val; this.next = next; }
 }
 

