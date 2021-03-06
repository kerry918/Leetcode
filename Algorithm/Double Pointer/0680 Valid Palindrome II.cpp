class Solution {
public:
  bool validPalindrome(string s) {
    int l = 0, r = s.length()-1; 
    
    while (l < r){
      // when there is a difference
      if (s[l] != s[r]){
        return isPalindrome(s, l+1, r) || isPalindrome(s, l, r-1); 
      }
      else {
        l++; 
        r--; 
      }
    }
    return true; 
  }
    
private: 
  bool isPalindrome(const string& s, int l, int r){
    while (l < r){
      if (s[l++] != s[r--]) return false; 
    }
    return true; 
  }
};
