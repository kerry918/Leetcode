class Solution:
  def findLongestWord(self, s: str, d: List[str]) -> str:
    # Sort the dictionary by length (desc)
    d.sort(key = lambda x: (-len(x),x))
    
    # Helper function to check if contain the word
    def helper(sub, whole):
      N, M = len(sub), len(whole)
      i, j = 0, 0
      # Loop through both the sub and the whole string
      while j<M and i<N:
        # If the sub string got a match in the whole, then move the pointer of the sub string
        if sub[i] == whole[j]:
          i+=1
        # Always move the whole string pointer forward
        j+=1
      # return to see if the sub string got all checked
      return i==N
    
    output = ""
    # check every word in the dictionary to see if it's a substring
    for w in d:
      if helper(w, s):
        return w
            
    return output