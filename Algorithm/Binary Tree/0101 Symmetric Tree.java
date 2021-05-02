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
  public boolean isSymmetric(TreeNode root) {
    return root != null ? isSymmetric(root.left, root.right) : true; 
  }
  
  // helper function
  public boolean isSymmetric(TreeNode left, TreeNode right){
    // if there is no left and right, then is symmetric
    if(left == null && right == null) return true; 
    // if only one node is null, then not symmetric
    if(left == null || right == null) return false; 
    // if the value of left and right is differnt, not symmetric
    if(left.val != right.val) return false; 
    
    // recursively call the helper fucntion to check the child nodes
    return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left); 
  }
}