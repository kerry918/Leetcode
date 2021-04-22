class Solution {
  public String addStrings(String num1, String num2) {
    int i = num1.length() - 1, j = num2.length() - 1; 
    int carry = 0; 
    
    StringBuilder result = new StringBuilder(); 
    
    while (i >= 0 || j >= 0){
      int d1 = i >= 0 ? num1.charAt(i) - '0' : 0; 
      int d2 = j >= 0 ? num2.charAt(j) - '0' : 0; 
      int sum = d1 + d2 + carry; 
      
      result.append(sum%10); 
      carry = sum/10; 
      --i; 
      --j; 
    }
    
    if (carry != 0)
      result.append(carry); 
    
    return result.reverse().toString(); 
  }
}