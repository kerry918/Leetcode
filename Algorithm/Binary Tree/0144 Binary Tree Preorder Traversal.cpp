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
  vector<int> preorderTraversal(TreeNode* root) {
    // initialize ans vector
    vector<int> ans; 
    // base check
    if (!root) return ans; 
    
    // using stack to return the preorder
    stack<TreeNode*> s; 
    // push the root node first
    s.push(root); 
    // loop while the stack is not empty
    while(!s.empty()){
      // get the top element in the stack 
      TreeNode* node = s.top(); 
      s.pop(); 
      ans.push_back(node->val); 
      // push the right node first to allow the left node to be process first in the stack 
      if (node->right){
        s.push(node->right); 
      }
      if (node->left){
        s.push(node->left); 
      }
    }
    return ans; 
  }
};