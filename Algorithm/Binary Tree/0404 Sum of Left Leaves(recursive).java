/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
  public int sumOfLeftLeaves(TreeNode root) {
    if (root == null) return 0; 
    
    // declare initial sum
    int sum_of_left_leaves = 0; 
    
    // if left node exist
    if (root.left != null){
      // check if is a leaf node
      if (root.left.left == null && root.left.right == null){
        sum_of_left_leaves += root.left.val; 
      } 
      // left node with children (traverse down the children)
      else {
        sum_of_left_leaves += sumOfLeftLeaves(root.left); 
      }
    }
    
    // right nodes 
    if (root.right != null){
      // if have children, traverse down the tree to find a left leaf node
      if (root.right.left != null || root.right.right != null){
        sum_of_left_leaves += sumOfLeftLeaves(root.right); 
      }
    }
    return sum_of_left_leaves; 
  }
}