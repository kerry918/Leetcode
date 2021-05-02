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
  public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
    // recursion and depth first search 
    // list of reference to tree node
    List<TreeNode> result = new ArrayList<>(); 
    if (root == null) return result; 
    
    // set of integer
    Set<Integer> toDelete = new HashSet<>(); 
    // put all the value of to delete into a set (search with constant time)
    for (int x : to_delete){
      toDelete.add(x); 
    }
    
    // use a helper method post traversal 
    removeNodes(root, toDelete, result); 
    // take care the left, right, root
    // check if the root has to be delete
    if (!toDelete.contains(root.val)){
      result.add(root); 
    }
    return result; 
  }
  
  // helper method
  private TreeNode removeNodes(TreeNode root, Set<Integer> toDelete, List<TreeNode> result){
    if (root == null) return null; 
    
    // remove left recursively then right
    root.left = removeNodes(root.left, toDelete, result); 
    root.right = removeNodes(root.right, toDelete, result); 
    
    // process the root node
    if (toDelete.contains(root.val)){
      if (root.left != null){
        result.add(root.left); 
      }
      if (root.right != null){
        result.add(root.right); 
      }
      return null; 
    }
    return root; 
  }
}