class Solution:
  def permute(self, nums: List[int]) -> List[List[int]]:
    # initialize result list
    result = []
    
    # base case
    if (len(nums) == 1):
      return [nums[:]]
    
    # Loop through the list
    for i in range(len(nums)):
      # pop the first number and store
      n = nums.pop(0)
      # solving recursively
      perms = self.permute(nums)
      
      # Add back the first number that being popped off
      for perm in perms:
        # append to the last position
        perm.append(n)
          
      # python appending multiple items
      result.extend(perms)
      # append back the first number to the last position
      nums.append(n)
        
    return result
          
        