class Solution:
  def findKthLargest(self, nums: List[int], k: int) -> int:
    # selete a pivot point
    pivot = random.choice(nums)
    
    # define left array (if element is greater than pivot)
    left = [x for x in nums if x > pivot]
    # define mid array (if element is equal to the pivot)
    mid = [x for x in nums if x == pivot]
    # define right array (if element is less than pivot)
    right = [x for x in nums if x < pivot]
    
    # define length of left and mid
    L,M = len(left), len(mid)
    
    # (k is less than length of L) inside the left array
    if k <= L:
        return self.findKthLargest(left, k)
    # inside the right array
    elif k > (L+M): 
        return self.findKthLargest(right, k - (L+M))
    # mid number is the k th largest
    else:
        return mid[0]
    
    # Quick Select