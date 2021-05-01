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
  public ListNode oddEvenList(ListNode head) {
    // initial checks
    if (head == null) return null; 
    
    // separate the linked list into two linked list (for odd and even)
    // connect the even list to the odd one at last
    ListNode odd = head; 
    ListNode even = head.next; 
    ListNode evenHead = even; 
    
    // loop through the linked list
    while(even != null && even.next != null){
      // split the linked list
      odd.next = even.next; 
      odd = odd.next; 
      even.next = odd.next; 
      even = even.next; 
    }
    
    // connect the two linked list
    odd.next = evenHead; 
    return head; 
  }
}