class Solution {
public:
  // since the parenthese should be matched 
  bool isValid(string s) {
    // declare a stack to track the parenthese
    stack<char> parse; 
    // loop through each character in the string
    for (int i = 0; i < s.length(); i ++){
      // if it's open parenthese, add that to the stack 
      if (s[i] == '(' || s[i] == '[' || s[i] == '{'){
        parse.push(s[i]); 
      }
      // if it's close parenthese, then check the top of the stack if has a match with the current parentheses
      else {
        if (parse.empty()) return false; // no closing parenthese
        // get the top of the stack 
        char c = parse.top(); 
        if ((s[i] == '}' && c == '{') || 
            (s[i] == ']' && c == '[') ||
            (s[i] == ')' && c == '(')){
          // pop the corresponding parentheses
          parse.pop(); 
        } else {
          return false; 
        }
      }
    }
    
    // after whole string is being gone through, check if the stack is empty
    return parse.empty(); 
  }
};