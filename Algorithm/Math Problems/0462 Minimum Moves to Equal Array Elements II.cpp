class Solution {
public:
  int minMoves2(vector<int>& nums) {
    nth_element(nums.begin(), nums.begin()+nums.size()/2, nums.end()); 
    // find the median value
    int median = nums[nums.size()/2]; 
    
    int moveCount = 0; 
    // loop through the vector to count the move required
    for (int i = 0; i < nums.size(); ++i){
      moveCount += abs(median - nums[i]); 
    }
    return moveCount;         
  }
};