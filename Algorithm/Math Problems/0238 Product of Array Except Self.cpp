class Solution {
public:
  vector<int> productExceptSelf(vector<int>& nums) {
    // initialize a answer vector
    int size = nums.size(); 
    vector<int> ans(size, 1); 
    
    // loop from left to right
    int counter = 1; 
    for (int i = 0; i < size; i++){
      ans[i] = counter; 
      counter *= nums[i]; 
    }
    
    // set counter to the last number in the given vector
    counter = nums[size-1]; 
    // loop from right to left 
    for (int i = size - 2; i > -1; i--){
      ans[i] *= counter; 
      counter *= nums[i]; 
    }
    
    return ans; 
  }
};