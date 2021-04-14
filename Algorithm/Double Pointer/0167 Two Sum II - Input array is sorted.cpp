class Solution {
public:
  vector<int> twoSum(vector<int>& numbers, int target) {
    int l = 0, r = numbers.size()-1, sum = 0; 
    while(l < r){
      // let sum equals the left most add right most
      sum = numbers[l] + numbers[r]; 
      // if sum equals to target break out the while and return
      if (sum == target) break; 
      // when the sum is less than target, move the left pointer to the right to increase sum
      if (sum < target) {
        l++; 
      }
      // when the sum is greater, move the right pointer to the left to decrease sum
      else r--; 
    }
    return vector<int>{l+1, r+1}; 
  }
};