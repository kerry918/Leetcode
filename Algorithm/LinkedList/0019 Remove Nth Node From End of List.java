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
  public ListNode removeNthFromEnd(ListNode head, int n) {
    // using slow and fast pointer 
    ListNode dummy_head = new ListNode(0); 
    dummy_head.next = head; 
    
    ListNode slow = dummy_head; 
    ListNode fast = dummy_head; 
    
    // move the fast pointer to the position+1
    for (int i=1; i <= n+1; i++){
      fast = fast.next; 
    }
    
    // move the fast and slow pointer (slow pointer will be right before the desire position)
    while(fast != null){
      slow = slow.next; 
      fast = fast.next; 
    }
    
    slow.next = slow.next.next; 
    return dummy_head.next; 
  }
}