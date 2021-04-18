class Solution:
  def frequencySort(self, s: str) -> str:
    # initialize answer list
    result = ''
    # initialize frequency dictionary
    freq = {}
    
    # loop through the string to store the frequency
    for ch in s:
      if ch not in freq:
        freq[ch] = 1
      else: 
        freq[ch] += 1
            
    # sort by the value
    s = sorted(freq, key=lambda x: freq[x], reverse=True)
    
    # loop through the dictionary and add the char into the result string
    for ch in s:
      result += ch * freq[ch]
        
    return result