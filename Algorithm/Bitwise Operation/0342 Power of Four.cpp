class Solution {
public:
  bool isPowerOfFour(int n) {
    // power of 2 if n&(n-1) = 0
    // power of 4 if n&(10101...101) is not 0 since if power of 4, the 1 is on a odd index position
    return n > 0 && !(n & (n - 1)) && (n & 1431655765);
  }
};