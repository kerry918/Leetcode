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
  int getMinimumDifference(TreeNode* root) {
    // traverse the tree using inorder
    vector<int> vect; 
    dfs(root, vect); 
    // set to a huge number 
    int mindiff = INT_MAX; 
    
    for (int i = 1; i < vect.size(); i ++){
      mindiff = min(mindiff, vect[i]-vect[i-1]); 
    }
    return mindiff; 
  }
  
  void dfs(TreeNode* root, vector<int>& vect) {
    if (!root) return; 
    
    dfs(root->left, vect); 
    vect.push_back(root->val); 
    dfs(root->right, vect); 
  }
};