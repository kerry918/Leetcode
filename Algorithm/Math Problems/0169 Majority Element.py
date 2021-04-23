class Solution:
  def majorityElement(self, nums: List[int]) -> int:
    # to keep track of the potential candidate at each step
    candidate = None
    # the number of appearance of the candidate at that step
    counter = 0
    for n in nums:
      if counter == 0:
        candidate = n
      counter += 1 if n == candidate else -1
    return candidate