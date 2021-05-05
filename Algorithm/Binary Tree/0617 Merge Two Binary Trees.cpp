/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
  TreeNode* mergeTrees(TreeNode* t1, TreeNode* t2) {
    if (t1 == NULL && t2 == NULL)
      return NULL;
    
    TreeNode* mergedTree;
    
    if (t1 == NULL){
      mergedTree = new TreeNode(t2->val);
      mergedTree->left = mergeTrees(NULL, t2->left);
      mergedTree->right = mergeTrees(NULL, t2->right);
    }
    else if (t2 == NULL){
      mergedTree = new TreeNode(t1->val);
      mergedTree->left = mergeTrees(t1->left, NULL);
      mergedTree->right = mergeTrees(t1->right, NULL);
    }
    else{
      mergedTree = new TreeNode(t1->val+t2->val);
      mergedTree->left = mergeTrees(t1->left, t2->left);
      mergedTree->right = mergeTrees(t1->right, t2->right);
    }
    
    return mergedTree;
  }
};