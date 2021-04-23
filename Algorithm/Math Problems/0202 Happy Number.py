class Solution:
  def isHappy(self, n: int) -> bool:
    # initial a set
    visit = set()
    
    while n not in visit:
      visit.add(n)
      n = self.sumOfSquares(n)
      
      if n == 1:
        return True
        
    return False
  
  # Helper function to calculate the sum of square of numbers
  def sumOfSquares(self, n: int) -> int:
    output = 0
    
    while n:
      # Grab the last digit
      digit = n % 10
      # square the digit
      digit = digit ** 2
      # add squared digit to the output
      output += digit
      # get the integer division
      n = n // 10
    return output