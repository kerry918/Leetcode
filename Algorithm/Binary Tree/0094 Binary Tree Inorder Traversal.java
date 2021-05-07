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
  public List<Integer> inorderTraversal(TreeNode root) {
    // stack of tree nodes
    Stack<TreeNode> stack = new Stack<>(); 
    List<Integer> output = new ArrayList<>(); 
    
    // base check 
    if (root == null) return output; 
    
    TreeNode current = root; 
    
    while (current != null || !stack.isEmpty()){
      // traverse to the left most node
      while (current != null){
        // traverse the left 
        stack.push(current); 
        current = current.left; 
      }
      
      current = stack.pop(); 
      output.add(current.val); 
      current = current.right; 
    }
    
    return output; 
  }
}