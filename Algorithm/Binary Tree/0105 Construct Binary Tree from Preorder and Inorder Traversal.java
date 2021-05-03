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
  // pre: root, left, right
  // in: left, root, right
  public TreeNode buildTree(int[] preorder, int[] inorder) {
    return helper(0, 0, inorder.length-1, preorder, inorder); 
  }
  
  // helper method to build the tree
  public TreeNode helper(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder){
    // check boundary
    if (preStart > preorder.length - 1 || inStart > inEnd) return null; 
    
    // first node in preorder is the root
    TreeNode root = new TreeNode(preorder[preStart]); 
    
    int inIndex = 0; 
    // loop through boundary
    for (int i = inStart; i <= inEnd; i++){
      // if the found the index of the root in the inorder array
      if (root.val == inorder[i]){
        inIndex = i; 
      }
    }
    
    // set the left and right nodes
    root.left = helper(preStart + 1, inStart, inIndex - 1, preorder, inorder); 
    // right: need to skip the left side 
    root.right = helper(preStart + inIndex - inStart + 1, inIndex + 1, inEnd, preorder, inorder); 
    
    return root; 
  }
}