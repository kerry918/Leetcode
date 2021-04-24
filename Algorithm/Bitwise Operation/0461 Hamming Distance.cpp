class Solution {
public:
  int hammingDistance(int x, int y) {
    // diff is the exclusive or of x and y (bitwise XOR)
    int diff = x ^ y, ans = 0;
    // count how many 1 there are
    while (diff) {
      ans += diff & 1;
      // bitwise right shift 
      diff >>= 1;
    }
    return ans;
  }
};