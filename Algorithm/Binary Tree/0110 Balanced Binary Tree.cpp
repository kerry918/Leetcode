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
  bool isBalanced(TreeNode* root) {
    // using a helper function to calculate the difference between the depth 
    return helper(root) != -1; 
  }
  
  int helper(TreeNode* root){
    // edge case
    if(!root){
      return 0; 
    }
    
    // recursively call the helper function to calculate the depth of the left and right subtree
    int left = helper(root->left), right = helper(root->right); 
    
    // check if the left and right are satisfy as balanced
    // if the absolute value between left and right is greater than 1, then already inbalanced
    if(left == -1 || right == -1 || abs(left-right) > 1){
      return -1; 
    }
    
    return 1 + max(left, right); 
  }
};