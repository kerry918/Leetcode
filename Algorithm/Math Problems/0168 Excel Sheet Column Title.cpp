class Solution {
public:
  string convertToTitle(int columnNumber) {
    // initialize a answer string
    string ans; 
    
    // go through the string (add the mod of the column number and 26 to get the correct letter)
    do {
      ans.push_back('A'+ (columnNumber - 1) % 26); 
      columnNumber = (columnNumber - 1) / 26; 
    } while (columnNumber); 
    
    // reverse the string to get correct ans
    reverse(ans.begin(), ans.end()); 
    return ans;         
  }
};