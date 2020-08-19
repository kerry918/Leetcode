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
    ListNode* reverseList(ListNode* head) {
        ListNode* prev = NULL; 
        ListNode* cur = head; 
        ListNode* next = NULL; 
        
        while(cur) {  // while cur points to nothing, reaches the end 
            next = cur->next; 
            cur->next = prev; 
            
            prev = cur; 
            cur = next; 
        }
        head = prev; 
        
        return prev; 
    }
};
