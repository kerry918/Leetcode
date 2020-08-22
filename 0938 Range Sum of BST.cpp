/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int rangeSumBST(TreeNode* root, int L, int R) {
        if (root == NULL)
            return 0; 
        
        int sum = 0; 
        inorder(root, L, R, sum);  
        return sum; 
    }
    
    void inorder(TreeNode* node, int L, int R, int &sum){
        if(node == NULL) return; 
        
        inorder(node->left, L, R, sum); 
        if (node->val >= L && node->val <= R){
            sum += node->val; 
        }
        inorder(node->right, L, R, sum); 
    }
};
