/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
  ListNode* swapPairs(ListNode* head) {
    // initialize a ptr for the head and one temp 
    ListNode *p = head, *s; 
    // check if there is at least two nodes
    if(p && p->next){
      // swap the nodes
      s = p->next; 
      p->next = s->next; 
      s->next = p; 
      // update the start of the list
      head = s; 
      // loop while there were two more nodes
      while(p->next && p->next->next){
        s = p->next->next; 
        p->next->next = s->next; 
        s->next = p->next; 
        p->next = s; 
        // update p 
        p = s->next; 
      }
    }
    return head; 
  }
};