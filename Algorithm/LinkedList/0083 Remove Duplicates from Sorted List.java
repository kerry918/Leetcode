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
class Solution {
  public ListNode deleteDuplicates(ListNode head) {
    // set the current to the head node
    ListNode cur = head; 
    // loop through the linked list
    while(cur!=null && cur.next != null){
      // check if cur and the next are the same, if same, skip the next node
      if (cur.next.val == cur.val){
        // skip the next node
        cur.next = cur.next.next; 
      } else {
        cur = cur.next; 
      }
    }
    
    return head; 
  }
}