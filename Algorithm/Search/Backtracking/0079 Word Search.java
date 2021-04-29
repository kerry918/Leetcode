class Solution {
  public boolean exist(char[][] board, String word) {
    // loop through the whole board to first find the starting character
    for (int i = 0; i < board.length; i++){
      for (int j = 0; j < board[0].length; j++){
        // if the cell have the starting character and can have the rest of the word from dfs, return true
        // dfs(board, row, col,  # of char we are on, word)
        if (board[i][j] == word.charAt(0) && dfs(board, i, j, 0, word)){
          return true; 
        }
      }
    }
    
    return false; 
  }
  
  // helper function 
  public boolean dfs(char[][] board, int i, int j, int count, String word){
    // check if found word
    if(count == word.length()){
      return true; 
    }
    
    // check if have gone outside of the grid or the character in the cell is not what we want
    if(i < 0 || i >= board.length || j < 0 || j >= board[i].length || board[i][j] != word.charAt(count)){
      return false; 
    }
    
    // continue the recursion
    char temp = board[i][j]; 
    // set the board to empty space
    board[i][j] = ' '; 
    boolean found = dfs(board, i + 1, j, count + 1, word)
        || dfs(board, i - 1, j, count + 1, word)
        || dfs(board, i, j + 1, count + 1, word)
        || dfs(board, i, j - 1, count + 1, word); 
    
    // restore the previous value
    board[i][j] = temp; 
    
    return found; 
  }
}