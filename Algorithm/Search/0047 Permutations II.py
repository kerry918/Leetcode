class Solution:
  def permuteUnique(self, nums: List[int]) -> List[List[int]]:
    # store the permutations
    res = []
    # store each permutation itself
    perm = []
    # count hashmap
    count = {n:0 for n in nums}
    # loop through the list and increment the count
    for n in nums: 
      count[n] += 1
        
    # dfs backtracking function
    def dfs():
      # base case (reaches to the length, then apped the perm list)
      if len(perm) == len(nums):
        res.append(perm.copy())
        return 
      
      # going through every unique number 
      for n in count:
        if count[n] > 0:
          perm.append(n)
          # decrement the count
          count[n] -= 1
          
          dfs()
          
          # clean up 
          count[n] += 1
          perm.pop() # remove the value we just added
        
    dfs()
    return res