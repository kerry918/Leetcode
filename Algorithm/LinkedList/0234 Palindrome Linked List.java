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
  public boolean isPalindrome(ListNode head) {
    // corner case
    if (head == null){
      return true; 
    }
    
    // using fast and slow pointer
    ListNode fast = head; 
    ListNode slow = head; 
    
    // move fast and slow pointer to the right
    // fast move twice
    // small move once
    // find the mid point of the list
    while(fast.next != null && fast.next.next != null){
      fast = fast.next.next; 
      slow = slow.next; 
    }
    
    // create two list and check if they are identical 
    ListNode secondHalfHead = reverse(slow.next); 
    ListNode firstHalfHead = head; 
    
    // compare the two list
    while(secondHalfHead != null && firstHalfHead != null){
      // if not identical return false
      if(firstHalfHead.val != secondHalfHead.val){
        return false; 
      }
      secondHalfHead = secondHalfHead.next; 
      firstHalfHead = firstHalfHead.next; 
    }
    return true; 
  }
  
  private ListNode reverse(ListNode head){
    ListNode newHead = null; 
    while(head != null){
      ListNode next = head.next; 
      head.next = newHead; 
      newHead = head; 
      head = next; 
    }
    return newHead; 
  }
}