class Solution {
public:
  bool search(vector<int>& nums, int target) {
    int n = nums.size(); 
    // check edge cases
    if (n == 0) return -1; 
    
    int low = 0, high = n - 1; 
    while(low <= high){
      int mid = low + (high-low)/2; 
      if (nums[mid] == target) return true; 
      
      // couldn't decide which side is increasing/decreasing
      if (nums[low] == nums[mid]){
        low ++; 
      }
      // right is increasing
      else if (nums[mid] <= nums[high]){
        if (nums[mid] < target && target <= nums[high]){
          low = mid + 1; 
        } 
        else {
          high = mid - 1; 
        }
      }
      // left is increasing
      else {
        if (target >= nums[low] && target < nums[mid]){
          high = mid - 1; 
        }
        else {
          low = mid + 1; 
        }
      } 
    }
    return false; 
  }
};
