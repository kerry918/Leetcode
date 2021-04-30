/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    // base case
    if (headA == null || headB == null) return null; 
    
    // set up the pointer/runnder
    ListNode a_pointer = headA; // shorter first
    ListNode b_pointer = headB; // longer first
    
    // while the nodes are not equal
    // traverse through the two list with each pointer (same resulting distance)
    while (a_pointer != b_pointer){
      if(a_pointer == null){ // at the end of the list
        a_pointer = headB; 
      } else {
        a_pointer = a_pointer.next; 
      }
      
      if(b_pointer == null){ // at the end of the list
        b_pointer = headA; 
      } else {
        b_pointer = b_pointer.next; 
      }
    }
    // once they meet
    return a_pointer; 
  }
}