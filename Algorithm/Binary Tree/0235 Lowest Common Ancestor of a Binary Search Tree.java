/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    // if both are on the left or both on the right
    if (p.val < root.val && q.val < root.val){
      // traverse down the left side
      return lowestCommonAncestor(root.left, p, q); 
    }
    if (p.val > root.val && q.val > root.val){
      // traverse down the right side
      return lowestCommonAncestor(root.right, p, q); 
    }
    return root; 
  }
}