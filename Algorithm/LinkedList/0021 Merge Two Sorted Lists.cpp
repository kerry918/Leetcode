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
  ListNode* mergeTwoLists(ListNode* l1, ListNode* l2) {
    // initialize an empty list node to store result and ptr for the list node
    ListNode *temp = new ListNode(0), *node = temp; 
    // while two list node are not empty
    while(l1 && l2){
      // compare the value
      if (l1->val <= l2->val){
        // store the l1 value
        node->next = l1; 
        // update start of l1
        l1 = l1->next;                 
      } else {
        node->next = l2; 
        l2 = l2->next; 
      }
      // move the node ptr 
      node = node->next; 
    }
    // when either one list is empty put all of the rest into the temp
    node->next = l1 ? l1 : l2; 
    // return the temp list (skip the first node)
    return temp->next; 
  }
};