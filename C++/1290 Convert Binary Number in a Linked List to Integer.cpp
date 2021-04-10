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
    int getDecimalValue(ListNode* head) {
        int ans = 0, count = 0, size = 0; 
        ListNode *temp = head; 
        // get the size of the linked list
        while (temp != NULL){
            size ++; 
            temp = temp->next; 
        }
        temp = head; 
        while (temp != NULL){
            if (temp->val == 1){
                ans += pow(2, size-count-1); 
            }
            count ++; 
            temp = temp->next; 
        }
        return ans; 
    }
};
