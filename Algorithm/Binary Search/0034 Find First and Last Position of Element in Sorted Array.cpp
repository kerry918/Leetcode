class Solution {
public:
  vector<int> searchRange(vector<int>& nums, int target) {
    // when nums is empty
    if (nums.empty()) return vector<int>{-1,-1}; 
    int lower = lower_bound(nums, target); 
    int upper = upper_bound(nums, target) - 1; // need to move left by one step
    if (lower == nums.size() || nums[lower] != target)
      return vector<int>{-1, -1}; 
    return vector<int>{lower, upper}; 
  }
    
  // helper function 
  int lower_bound(vector<int>& nums, int target){
    int l = 0, r = nums.size(), mid; 
    // binary search
    while (l < r){
      mid = l + (r-l)/2; 
      if (nums[mid] >= target)
        r = mid; 
      else 
        l = mid + 1; 
    }
    return l; 
  }
    
  // helper function 
  int upper_bound(vector<int>& nums, int target){
    int l = 0, r = nums.size(), mid; 
    // binary search
    while (l < r){
      mid = l + (r-l)/2; 
      if (nums[mid] > target)
        r = mid; 
      else 
        l = mid + 1; 
    }
    return l; 
  }
};