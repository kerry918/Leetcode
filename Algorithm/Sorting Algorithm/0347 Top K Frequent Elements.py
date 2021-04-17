import heapq

class Solution:
  def topKFrequent(self, nums: List[int], k: int) -> List[int]:
    # initialize the answer array
    ans = []
    # initialize the frequency dictionary
    freq = dict()
    
    # loop through the array to store the frequency
    for num in nums: 
      # add to dict
      if num not in freq: 
        freq[num] = 1
      else: 
        freq[num] += 1
    
    # add to the heap 
    for key, val in freq.items():
      # if the heap is not full yet, push the element into the heap
      if len(ans) < k:
        heapq.heappush(ans, [val, key])
      else: 
        heapq.heappushpop(ans, [val, key])
      
    return [key for value, key in ans]
                