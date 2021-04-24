class Solution {
public:
  int singleNumber(vector<int>& nums) {
    int ans = 0;
    // using the fact that x^x = 0, and x^0 = x
    for (const int & num: nums) {
      ans ^= num;
    }
    return ans;
  }
};