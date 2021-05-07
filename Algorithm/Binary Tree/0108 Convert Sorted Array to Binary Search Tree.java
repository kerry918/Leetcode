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
  public TreeNode sortedArrayToBST(int[] nums) {
    // base case
    if (nums.length == 0) return null; 
    // return a helper method
    return constructTreeFromArray(nums, 0, nums.length - 1); 
  }
  
  // helper function (take in a left and right boundary)
  public TreeNode constructTreeFromArray(int[] nums, int left, int right){
    if (left > right) return null; 
    int midpoint = left + (right-left) / 2; 
    // make a treenode using the midpoint of the array
    TreeNode node = new TreeNode(nums[midpoint]); 
    
    // recursively set the left and right
    node.left = constructTreeFromArray(nums, left, midpoint - 1); 
    node.right = constructTreeFromArray(nums, midpoint + 1, right); 
    
    return node; 
  }
}