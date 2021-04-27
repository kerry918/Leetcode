class Solution {
  public int lengthOfLongestSubstring(String s) {
    // using sliding window
    // initialize pointers and variable to store the max length
    int left = 0, right = 0, max = 0; 
    
    // initialize a hash set to keep unique characters
    HashSet<Character> hash_set = new HashSet(); 
    
    // loop throught the string while right exist
    while(right < s.length()){
      // check if the character is in the hash set
      if (!hash_set.contains(s.charAt(right))){
        hash_set.add(s.charAt(right)); 
        right++; 
        // get the max of the current hash set and the previous
        max = Math.max(hash_set.size(), max); 
      } 
      // if character exist
      else {
        // remove the character from the hash set
        hash_set.remove(s.charAt(left)); 
        // move the left pointer forward
        left ++; 
      }
    }
    
    return max; 
  }
}