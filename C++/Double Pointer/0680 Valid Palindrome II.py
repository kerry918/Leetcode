class Solution:
  def validPalindrome(self, s: str) -> bool:
    # initialize a left and right pointer
    l = 0
    r = len(s) - 1
    # loop through the string
    while l < r:
      if s[l] == s[r]:
        l += 1
        r -= 1
      else: 
        # s[l:r][::-1] reverts the string
        # Checking deleting the right char or deleting the left char with return a palindrome
        return s[l:r] == s[l:r][::-1] or s[l+1:r+1] == s[l+1:r+1][::-1]
    return True
                