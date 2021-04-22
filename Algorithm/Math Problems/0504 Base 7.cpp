class Solution {
public:
  string convertToBase7(int num) {
    // base case
    if (num == 0) return "0";
    // check if the number is number 
    bool is_negative = num < 0;
    // convert the number if negative
    if (is_negative) num = -num;
    // initialize number
    string ans;
    // using mod to calculate the ans
    while (num) {
      int a = num / 7, b = num % 7;
      ans = to_string(b) + ans;
      num = a;
    }
    // add a negative sign before the number if negative
    return is_negative? "-" + ans: ans;
  }
};