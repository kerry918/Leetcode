class Solution {
  public void solve(char[][] board) {
    // edge case check
    if (board == null || board.length == 0) return; 
    
    int rows = board.length, cols = board[0].length; 
    boolean[][] visited = new boolean[rows][cols]; 
    
    // check the first and last row
    for (int j = 0; j < cols; j++){
      if(board[0][j] == 'O'){
        // use dfs to find all connected Os
        // false: no need to flip
        dfs(board, 0, j, visited, false); 
      }
      
      if (board[rows - 1][j] == 'O'){
        // use dfs to find all connected Os
        // false: no need to flip
        dfs(board, rows - 1, j, visited, false); 
      }
    }
    
    // check the right and left col
    for (int i = 0; i < rows; i ++){
      if (board[i][0] == 'O'){
        // use dfs to find all connected Os
        // false: no need to flip
        dfs(board, i, 0, visited, false); 
      }
      
      if (board[i][cols - 1] == 'O'){
        // use dfs to find all connected Os
        // false: no need to flip
        dfs(board, i, cols - 1, visited, false); 
      }
    }
    
    // iterate the inner region
    for (int i = 1; i < rows - 1; i++){
      for (int j = 1; j < cols - 1; j++){
        if (board[i][j] == 'O' && !visited[i][j]){
          // use dfs to find all connected Os
          // true: need to flip
          dfs(board, i, j, visited, true); 
        }
      }
    }
  }
  
  private void dfs(char[][]board, int row, int col, boolean[][]visited, boolean flip){
    // check if valid
    if (row < 0 || col < 0 || row > board.length - 1 || col > board[0].length - 1) return; 
    // if have already visited
    if (visited[row][col]) return; 
    // if the cell has X
    if (board[row][col] == 'X') return; 
    // check if need to flip
    if (flip){
      board[row][col] = 'X'; 
    }
    
    // mark the cell as visited
    visited[row][col] = true; 
    // use dfs to search the four directions
    dfs(board, row + 1, col, visited, flip); 
    dfs(board, row - 1, col, visited, flip);
    dfs(board, row, col + 1, visited, flip);
    dfs(board, row, col - 1, visited, flip);
  }
}