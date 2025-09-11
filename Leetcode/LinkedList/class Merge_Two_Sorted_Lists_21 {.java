package Leetcode.LinkedList;

class Merge_Two_Sorted_Lists_21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode root=null;
        ListNode ptr=null;
        if(list1==null || list2==null){
             return ((list1==null)?list2:list1);
        }
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                if(root==null){
                    root=list1;
                    ptr=root;
                }else{
                    ptr.next=list1;
                    ptr=ptr.next;
                }
                list1=list1.next;
            }else{
                if(root==null){
                    root=list2;
                    ptr=root;
                }else{
                    ptr.next=list2;
                    ptr=ptr.next;
                }
                list2=list2.next;
            }
        }
        ptr.next=((list1==null)?list2:list1);
        return root;

    }
}
// Definition for singly-linked list.
 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
  //to merge two sorted linked lists and return it as a new sorted list
//The new list should be made by splicing together the nodes of the first two lists
//Approach: use two pointers to traverse both lists
//compare the values of the nodes and add the smaller one to the new list
//if one list is exhausted add the remaining nodes of the other list to the new list
//return the new list