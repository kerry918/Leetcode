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
    
    Stack<TreeNode> stack = new Stack(); 
    stack.add(root); 
    
    while (!stack.isEmpty()){
      // get the top node in the stack
      TreeNode node = stack.pop(); 
      
      if (node.left != null){
        if (node.left.left == null && node.left.right == null){
          sum_of_left_leaves += node.left.val; 
        } 
        // keep traversing
        else {
          stack.add(node.left); 
        }
      }
      
      if (node.right != null){
        if (node.right.left != null || node.right.right != null){
          stack.add(node.right); 
        }
      }
    }
    
    return sum_of_left_leaves; 
  }
}