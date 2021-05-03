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
  vector<double> averageOfLevels(TreeNode* root) {
    // declare an answer vector
    vector<double> ans; 
    // base check
    if (! root){
      return ans; 
    }
    
    // declare a queue to store the tree nodes
    queue<TreeNode*> q; 
    // initially push the root in the queue
    q.push(root); 
    // loop while the queue is not empty
    while(!q.empty()){
      // get the size of queue
      int count = q.size(); 
      double sum = 0; 
      for (int i = 0; i < count; i ++){
        // get the first treenode
        TreeNode* node = q.front(); 
        // remove the node
        q.pop(); 
        sum += node->val; 
        // check the left and right node and push into the queue
        if(node->left){
          q.push(node->left); 
        }
        if(node->right){
          q.push(node->right); 
        }
      }
      // when all the current level nodes being added
      ans.push_back(sum/count); 
    }
    return ans; 
  }
};