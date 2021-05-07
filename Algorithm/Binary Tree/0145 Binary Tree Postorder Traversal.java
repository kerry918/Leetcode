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
  // post: left, right, root
  public List<Integer> postorderTraversal(TreeNode root) {        
    // dfs using a helper function
    return dfs(root, new ArrayList()); 
  }
  
  // helper function 
  private List<Integer> dfs(TreeNode root, List<Integer> list){
    // base casel 
    if (root == null) return list; 
    
    // traverse the left first, right second
    list = dfs(root.left, list); 
    list = dfs(root.right, list); 
    // add the node value to list 
    list.add(root.val); 
    return list; 
  }
}