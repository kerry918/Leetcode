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
    ListNode* removeElements(ListNode* head, int val) {
        //Base case: empty list 
        if(!head) return NULL; 
        //General case1: val is at a start 
        ListNode* a = NULL; 
        while(head&&head->val==val){
            a=head->next; 
            delete head; 
            head=a; 
        }
        //General case2: val not at a start 
        ListNode* cur = head; 
        a=(cur?cur->next:NULL); 
        while(a){
            if(a->val==val){
                cur->next = a->next; 
                delete a; 
            }
            else{
                cur=a; 
            }
            a=(cur?cur->next:NULL); 
        }
        return head; 
    }
};
