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
  public ListNode sortList(ListNode head) {
    // edge case
    if (head == null || head.next == null) return head; 
    
    // using merge sort
    ListNode temp = head; 
    ListNode slow = head; 
    ListNode fast = head; 
    
    // split the linked into half
    // slow while end in the middle of the list
    // temp will be the end of the first half, slow will be the start of the second half
    // fast will be at the end of the second half, head will be the start of the first half
    while (fast != null && fast.next != null){
      temp = slow; 
      slow = slow.next; 
      fast = fast.next.next; 
    }
    
    temp.next = null; 
    
    // recursively split, sort and merge the list
    ListNode left_side = sortList(head);  // head of first list
    ListNode right_side = sortList(slow); // head of second list
    
    return merge(left_side, right_side); 
  }
  
  public ListNode merge(ListNode l1, ListNode l2){
    ListNode sorted_temp = new ListNode(0); 
    ListNode current_node = sorted_temp; 
    
    // check both lists and put the smaller val into the temp list
    while (l1 != null && l2 != null){
      if (l1.val < l2.val){
        current_node.next = l1; 
        l1 = l1.next; 
      } else {
        current_node.next = l2; 
        l2 = l2.next; 
      }
      
      current_node = current_node.next; 
    }
    
    if (l1 != null){
      current_node.next = l1; 
      l1 = l1.next; 
    }
    
    if (l2 != null){
      current_node.next = l2; 
      l2 = l2.next; 
    }
    
    return sorted_temp.next; // head of new list
  }
}