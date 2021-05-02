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
  int diameterOfBinaryTree(TreeNode* root) {
    // initialize the diameter variable 
    int diameter = 0; 
    // using a helper function to calcualte the depth of each side from every node
    helper(root, diameter); 
    return diameter; 
  }
  
  // helper function
  int helper(TreeNode* root, int& diameter){
    // edge case
    if(!root){
      return 0; 
    }
    // recursively call the helper function to find the length
    int left = helper(root->left, diameter), right = helper(root->right, diameter); 
    // update the maximum diameter
    diameter = max(left+right, diameter); 
    return 1 + max(left, right); 
  }
};