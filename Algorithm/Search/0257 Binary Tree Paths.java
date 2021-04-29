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
  public List<String> binaryTreePaths(TreeNode root) {
    List<String> result = new ArrayList(); 
    // edge case
    if (root == null) return result; 
    
    // making a string of the root
    String current_path = Integer.toString(root.val); 
    // if at leaf
    if (root.left == null && root.right == null) result.add(current_path); 
    // if there is children node
    if (root.left != null) dfs(root.left, current_path, result); 
    if (root.right != null) dfs(root.right, current_path, result);       
    
    return result; 
  }
  
  // helper function 
  public void dfs(TreeNode node, String current_path, List<String> result){
    // added everytime 
    current_path += "->" + node.val; 
    
    if (node.left == null & node.right == null){
      result.add(current_path); 
      return; 
    }
    
    // check left and right children
    if (node.left != null) dfs(node.left, current_path, result); 
    if (node.right != null) dfs(node.right, current_path, result);   
      
  }
}