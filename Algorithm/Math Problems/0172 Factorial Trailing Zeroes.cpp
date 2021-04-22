class Solution {
public:
  int trailingZeroes(int n) {
    // need to track the number of 5 s (2 and 5 makes up to a 10 - 1 zero)
    return n == 0? 0: n / 5 + trailingZeroes(n / 5);
  }
};