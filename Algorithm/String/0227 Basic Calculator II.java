class Solution {
  public int calculate(String s) {
    // check edge case
    if (s == null || s.isEmpty()) return 0;
    // get the length of the string 
    int length = s.length();
    int currentNumber = 0, lastNumber = 0, result = 0;
    // set operation to plus as default
    char operation = '+';
    // loop through the string
    for (int i = 0; i < length; i++) {
      // get the current character
      char currentChar = s.charAt(i);
      // check if it's a number
      if (Character.isDigit(currentChar)) {
        // update/set the currentNumber
        currentNumber = (currentNumber * 10) + (currentChar - '0');
      }
      // if current character is a string (operator)
      if (!Character.isDigit(currentChar) && !Character.isWhitespace(currentChar) || i == length - 1) {
        if (operation == '+' || operation == '-') {
          result += lastNumber;
          lastNumber = (operation == '+') ? currentNumber : -currentNumber;
        } else if (operation == '*') {
          lastNumber = lastNumber * currentNumber;
        } else if (operation == '/') {
          lastNumber = lastNumber / currentNumber;
        }
        operation = currentChar;
        currentNumber = 0;
      }
    }
    result += lastNumber;
    return result;
  }
}
