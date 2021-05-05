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
  public TreeNode invertTree(TreeNode root) {
    // flip node at each layer (subtree)
    if (root == null) return null; 
    
    // traverse down the left and right side of the tree
    TreeNode left = invertTree(root.left); 
    TreeNode right = invertTree(root.right); 
    
    // swap
    root.right = left; 
    root.left = right; 
    
    return root; 
  }
}