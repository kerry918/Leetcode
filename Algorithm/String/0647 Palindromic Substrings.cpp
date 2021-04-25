class Solution {
public:
  int countSubstrings(string s) {
    int count = 0;
    for (int i = 0; i < s.length(); ++i) {
      count += extendSubstrings(s, i, i); // odd number check 
      count += extendSubstrings(s, i, i + 1); // even number check
    }
    return count;
  }
  
  // helper function (check for the number of palindroms)
  int extendSubstrings(string s, int l, int r) {
    int count = 0;
    while (l >= 0 && r < s.length() && s[l] == s[r]) {
      --l;
      ++r;
      ++count;
    }
    return count;
  }
};