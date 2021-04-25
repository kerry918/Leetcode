class Solution:
  def findComplement(self, num: int) -> int:
    # Flipping bits always : ^1 (XOR 1)
    temp = num
    bit = 1
    # going through all digit
    while temp: 
      num = num ^ bit
      # shift one digit to the left
      bit <<= 1
      # right shift temp one digit
      temp >>= 1
    return num