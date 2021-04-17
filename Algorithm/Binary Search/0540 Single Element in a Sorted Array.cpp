class Solution {
public:
  int singleNonDuplicate(vector<int>& nums) {
    // set the pointers to the first and last element
    int high = nums.size() - 1; 
    int low = 0; 
    int mid; 
    
    // Boundary check (see if the single element is at the end)
    if (high == 0) return nums[0]; 
    else if (nums[low] != nums[low+1]) return nums[low]; 
    else if (nums[high] != nums[high-1]) return nums[high]; 
    
    // Binary search through the vector
    while(low<=high){
      // find the mid point
      mid = low + (high-low)/2; 
      // check if unique element
      if (nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]) return nums[mid]; 
      
      // move the low and high pointer accordingly
      if ((mid%2==0 && nums[mid]==nums[mid+1]) || (mid%2==1 && nums[mid]==nums[mid-1])){
        low = mid + 1; 
      } else {
        high = mid - 1; 
      }
    }
    return -1; 
  }
};