class Solution {
public:
  bool hasAlternatingBits(int n) {
    long reverse = n ^ (n>>1);  // 111111111111....
    return !(reverse&(reverse+1)); 
  }
};