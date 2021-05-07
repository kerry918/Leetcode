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
  public TreeNode constructFromPrePost(int[] pre, int[] post) {
    // pre: root, left, right
    // post: left, right, root
    return dfs(pre, 0, pre.length - 1, post, 0, pre.length - 1); 
  }
  
  // helper function
  private TreeNode dfs(int[] pre, int preStart, int preEnd, int[] post, int postStart, int postEnd){
    // base check (if the array is empty)
    if(preStart > preEnd) return null; 
    // declare a treenode (first node of pre is the root)
    TreeNode root = new TreeNode(pre[preStart]); 
    
    // when preStart equals to preEnd return the node (only on node left)
    if (preStart == preEnd) return root; 
    
    
    int postIndex = postStart; 
    // find the next node in the pre order in the post array (root of the next subtree)
    while (post[postIndex] != pre[preStart + 1]) postIndex ++; 
    
    // get the length of the subtree
    int len = postIndex - postStart + 1; 
    root.left = dfs(pre, preStart + 1, preStart + len, post, postStart, postIndex); 
    root.right = dfs(pre, preStart + len + 1, preEnd, post, postIndex + 1, postEnd - 1); 
    
    return root; 
  }
}