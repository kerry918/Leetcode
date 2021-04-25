class Solution {
  public int countBinarySubstrings(String s) {
    // initialize a cur to store how many times the current number appears
    // initialize a prev to store how many times the previous number appears
    int cur = 1, prev = 0, count = 0; 
    // loop through the string
    for (int i = 1; i < s.length(); i++){
      // if same number occuring, add the counter cur
      if (s.charAt(i) == s.charAt(i-1)){
        cur ++; 
      } else {
        // store the value or cur into prev
        prev = cur; 
        // reset the cur counter
        cur = 1; 
      }
      
      // check how many substrings are qualified
      // add onto the counter while previous number appear is greater
      if (prev >= cur){
        count ++; 
      }
    }
    return count; 
  }
}