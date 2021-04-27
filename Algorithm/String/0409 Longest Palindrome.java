class Solution {
  public int longestPalindrome(String s) {
    // initialize a array to store the occurance of each character
    int[] char_counts = new int[128]; 
    // loop through the string to track the occurances
    for (char c : s.toCharArray()){
      char_counts[c] ++; 
    }
    
    // initialize a result
    int result = 0; 
    // check the number of occurances
    // get the largest divide of the occurance by 2 and * 2 (3/2 = 1 * 2 = 2)
    for (Integer char_count : char_counts){
      result += char_count / 2 * 2; 
      // check if an extra charcter is able to be added
      if (result % 2 == 0 && char_count % 2 == 1)
        result += 1; 
    }
    
    return result; 
  }
}