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
  public TreeNode buildTree(int[] inorder, int[] postorder) {
    // in: left, root, right
    // post: left, right, root
    return constructTree(inorder, postorder, 0, inorder.length - 1, postorder.length - 1); 
  }
  
  private TreeNode constructTree(int[] inorder, int[] postorder, int start, int end, int index){
    if (start > end) return null; 
    
    // construct a tree with a node with the value from the last index in the postorder
    TreeNode root = new TreeNode(postorder[index]); 
    
    int inRootIndex = start; 
    // find the root node in the inorder array
    while (postorder[index] != inorder[inRootIndex]) inRootIndex ++; 
    
    // recursively set the child nodes
    root.right = constructTree(inorder, postorder, inRootIndex + 1, end, index - 1); 
    root.left = constructTree(inorder, postorder, start,inRootIndex - 1, index - (end - inRootIndex) - 1); 
    
    return root; 
  }
}