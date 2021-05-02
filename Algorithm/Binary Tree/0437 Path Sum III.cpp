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
  int pathSum(TreeNode* root, int targetSum) {
    if (!root) return 0; 
    // find the number of possible path 
    else return pathSumStartWithRoot(root, targetSum) + 
      pathSum(root->left, targetSum) + 
      pathSum(root->right, targetSum); 
  }
  
  int pathSumStartWithRoot(TreeNode* root, int targetSum){
    // edge case
    if (!root) return 0; 
    
    // if the node equal to target sum, then initialize the count as 1
    int count = root->val == targetSum ? 1 : 0; 
    // recursively find the path
    count += pathSumStartWithRoot(root->right, targetSum - root->val); 
    count += pathSumStartWithRoot(root->left, targetSum - root->val); 
    return count; 
  }
};