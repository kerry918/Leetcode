class Solution:
  def sortColors(self, nums: List[int]) -> None:
    """
    Do not return anything, modify nums in-place instead.
    """
    # initialize several pointers
    l = 0
    r = len(nums) - 1
    cur = 0
    
    # use two pointers on the two ends
    while (cur <= r):
      # if number is 0, swap with l (to stay on the left)
      if nums[cur] == 0:
        nums[l], nums[cur] = nums[cur], nums[l]
        l += 1
        cur += 1
      # if number is 2, swap with r (to stay on the right)
      elif nums[cur] == 2:
        nums[r], nums[cur] = nums[cur], nums[r]
        r -= 1
      else: 
        cur += 1