# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
  def deleteDuplicates(self, head: ListNode) -> ListNode:
    cur = head; 
    
    while cur:
      temp = cur.next
      while temp and cur.val == temp.val:
        temp = temp.next
      cur.next = temp
      cur = temp
    
    return head