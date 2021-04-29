class Solution:
  def pacificAtlantic(self, heights: List[List[int]]) -> List[List[int]]:
    # Helper function (depth first search)
    def dfs(stack):
      directions = [(1, 0), (-1, 0), (0, 1), (0, -1)]
      seen = set(stack)
      while stack: 
        i, j = stack.pop()
        
        for d in directions: 
          ni = i + d[0]
          nj = j + d[1]
          
          if 0 <= ni < m and 0 <= nj < n and (ni, nj) not in seen and heights[ni][nj] >= heights[i][j]:
            stack.append((ni, nj))
            seen.add((ni, nj))
      
      return seen
    
    # base check
    if not heights: 
        return None
    
    # grab the length and width of the matrix
    m = len(heights)
    n = len(heights[0])
    
    # initialize two lists to store the location where pacific and atlantic water can flow
    p = []
    a = []
    
    # looping through each row
    for i in range(m):
      p.append((i, 0))
      a.append((i, n-1))
        
    # looping through each column
    for j in range(n): 
      p.append((0, j))
      a.append((m-1, j))
    
    # dfs through the pacific and atlantic
    # p will be all the cells that could flow to the pacific ocean 
    # a will be all the cells that could flow to the atlantic ocean
    p = dfs(p)
    a = dfs(a)
    
    # do a intersection of p and a
    ans = []
    
    for c in p: 
      if c in a: 
        ans.append(c)
    
    return ans