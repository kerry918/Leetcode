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
  ListNode* reverseList(ListNode* head, ListNode* prev=nullptr) {
    // edge case
    if (!head){
      return prev; 
    }
    // assign a new pointer to the next list node to be reverse
    ListNode* next = head->next; 
    // update the current list node's prev to the previous one
    head->next = prev; 
    // recursively update the list
    return reverseList(next, head); 
  }
};

class Solution {
public: 
  ListNode* reverseList(ListNode* head){
    // initialize a next and prev pointers
    ListNode* prev=nullptr, *next; 
    // update while there is list node 
    while(head){
      // set the next pointer
      next = head->next; 
      // update the current list node's next ptr
      head->next = prev; 
      // set the current list node to prev for next round
      prev = head; 
      // update head
      head = next; 
    }
    return prev; 
  }
}; 