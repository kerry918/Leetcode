# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
  def isSubtree(self, root: TreeNode, subRoot: TreeNode) -> bool:
    # if both nodes does not exist return true
    if not root and not subRoot: 
      return True
    # if only one node exist
    elif not root or not subRoot: 
      return False
    # traverse through the whole tree and the root node with a helper function
    return self.isSameTree(root, subRoot) or \
      self.isSubtree(root.left, subRoot) or \
      self.isSubtree(root.right, subRoot)
  
  # helper function
  def isSameTree(self, root: TreeNode, subRoot: TreeNode) -> bool:
    if not root and not subRoot: 
      return True
    elif not root or not subRoot:
      return False
    return root.val == subRoot.val and \
      self.isSameTree(root.left, subRoot.left) and \
      self.isSameTree(root.right, subRoot.right)