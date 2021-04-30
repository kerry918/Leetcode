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
    bool isPalindrome(ListNode* head) {
        int num=0; 
        ListNode* temp = head; 
        // get size of linked list
        while(temp){
            temp=temp->next; 
            ++num; 
        }
        // Create a new list with the same size as the given 
        vector<int> list; 
        list.resize(num); 
        temp = head; 
        // reverse the list and store into the new linked list 
        while(temp){
            list.push_back(temp->val); 
            temp = temp->next; 
        }
        // check the first and last elements 
        while(head){
            int last=list.back(); 
            list.pop_back(); 
            if(head->val!=last)
                return false; 
            head = head->next; 
        }
        return true; 
    }
};
