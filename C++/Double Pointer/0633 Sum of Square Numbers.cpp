class Solution {
public:
  bool judgeSquareSum(int c) {
    // find the largest possible number (for sqrt)
    long m = sqrt(c); 
    // loop through the range from 0 to the max number
    for (long a = 0; a <= m; ++a){
      // estimate b 
      long b = round(sqrt(c-a*a)); 
      // check if satisfy with requirement
      if (a*a + b*b == c) return true; 
    }
    return false; 
  }
};