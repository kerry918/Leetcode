class Solution {
  public boolean isIsomorphic(String s, String t) {
    if (s == null || t == null || s.length() != t.length())
      return false; 
    
    // initialize array with size of ascii (for s and t) to map the position of each charater in s and t
    int[] m1 = new int[256]; // Extended ASCII
    int[] m2 = new int[256]; 
    int n = s.length(); 
    
    for (int i = 0; i < n; i++){
      char c1 = s.charAt(i); 
      char c2 = t.charAt(i); 
      // check if c1 is not mapping to the same position as c2
      // make sure one to one mapping
      if (m1[c1] != m2[c2])
        return false; 
      m1[c1] = i + 1; 
      m2[c2] = i + 1; 
    }
    return true;         
  }
}