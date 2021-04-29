class Solution {
    
  boolean seen[][]; 
  
  public int maxAreaOfIsland(int[][] grid) {
    // initialize the max area variable
    int max_area = 0; 
    
    int rows = grid.length; 
    int columns = grid[0].length; 
    
    seen = new boolean[rows][columns]; 
    
    // loop through the whole gird
    for(int i = 0; i < rows; i++){
      for(int j = 0; j < columns; j++){
        // update the max area each time
        max_area = Math.max(max_area, area(i, j, grid)); 
      }
    }
    
    return max_area; 
  }
  
  // helper function to calculate the area of the island
  public int area(int row, int column, int [][] grid){
    // if empty or row/col is exceeding 
    // check if the cell has been seen
    if (row < 0 || row >= grid.length || 
      column < 0 || column >= grid[row].length || 
      seen[row][column] || (grid[row][column] == 0))
      
      return 0; 
    
    // set the cell to already seen 
    seen[row][column] = true; 
    // check recursively (up, down, right, left)
    return 1 + area(row+1, column, grid) + 
          area(row-1, column, grid) + 
          area(row, column+1, grid) + 
          area(row, column-1, grid); 
  }
}