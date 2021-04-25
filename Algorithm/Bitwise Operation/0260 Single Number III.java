class Solution {
  public int[] singleNumber(int[] nums) {
    // initialize ans array
    int [] ans = new int[2]; 
    int x = 0; 
    for (int num : nums){
      // XOR all bits
      x ^= num; 
    }
    
    // make partitioner
    x = x & (~(x-1)); 
    
    for (int num: nums){
      // split the digits into two parts 
      if ((num & x) == 0){
        ans[0] ^= num; 
      } else {
        ans[1] ^= num; 
      }
    }
    return ans; 
  }
}