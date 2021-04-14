/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
  ListNode *detectCycle(ListNode *head) {
    // initialize both fast pointer and slow pointer to be at the head of the list
    ListNode *slow = head, *fast = head; 
    // check if there is a cycle (fast moving two steps forward and slow moving one step forward)
    do {
      // fast met the end then return null
      if (!fast || !fast->next) return NULL; 
      // update the fast and slow pointer
      fast = fast-> next->next; 
      slow = slow->next; 
    } while(fast != slow); 
    // if a cycle exist 
    fast = head; 
    while (fast != slow){
      // update them by one step
      slow = slow->next; 
      fast = fast->next; 
    }
    return slow; 
  }
};