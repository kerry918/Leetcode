class Solution {
public:
  bool isAnagram(string s, string t) {
    // check the length of two strings
    if (s.length() != t.length()){
      return false; 
    }
    
    // create a vector to store/check each letter
    vector<int> counts(26, 0);
    // loop through all letters in s
    for (int i = 0; i < s.length(); i++){
      // add if a letter appear in s
      ++counts[s[i] - 'a']; 
      // minus if a letter appear in t
      --counts[t[i] - 'a']; 
    }
    // loop again to check if there is any non zero 
    for (int i = 0; i < 26; i++){
      if (counts[i])
        return false; 
    }
    return true;
  }
};