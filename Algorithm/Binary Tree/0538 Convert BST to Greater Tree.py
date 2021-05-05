# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
  def convertBST(self, root: TreeNode) -> TreeNode:
    # reverse inorder traversal
    
    # depth first tree
    def dfs(node, carry):
      if not node: return carry
      # traverse right
      carry = dfs(node.right, carry)
      # update the node
      carry += node.val
      node.val = carry
      # traverse left
      carry = dfs(node.left, carry)
      return carry 
    
    dfs(root, 0)
    return root