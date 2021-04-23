class Solution {
  public String addBinary(String a, String b) {
    int i = a.length() - 1, j = b.length() - 1; 
    int carry = 0; 
    
    StringBuilder result = new StringBuilder(); 
    
    while (i >= 0 || j >= 0){
      // - '0' to convert the string to int
      int d1 = i >= 0 ? a.charAt(i)- '0' : 0; 
      int d2 = j >= 0 ? b.charAt(j)- '0' : 0; 
      int sum = d1 + d2 + carry; 
      
      result.append(sum%2); 
      carry = sum/2; 
      --i; 
      --j; 
    }
    
    if (carry != 0)
      result.append(carry); 
    
    return result.reverse().toString(); 
  }
}