class Solution {
  public String minWindow(String s, String t) {
    if (s == null || t == null) return ""; // if either string is empty, then return empty string
    // initialize answer string
    String ans = ""; 
    // record the number of character needed (ascii)
    int[] letterCount = new int[128]; 
    int left = 0, count = 0, minLen = Integer.MAX_VALUE; 
    for (char c : t.toCharArray())
      ++letterCount[c]; 
    for (int right = 0; right < s.length(); ++right){
      if (--letterCount[s.charAt(right)] >= 0)
        ++ count; 
      while (count == t.length()){
        if(minLen > right - left + 1){
          minLen = right - left + 1; 
          ans = s.substring(left, right+1); 
        }
        if (++ letterCount[s.charAt(left)] > 0)
          --count; 
        ++left; 
          
      }
    }
   
    return ans; 
  }
}