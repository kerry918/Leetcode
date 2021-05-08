class Solution {
  public boolean searchMatrix(int[][] matrix, int target) {
    int m = matrix.length; // number of rows
    if (m == 0) return false; 
    
    int n = matrix[0].length; // number of cols
    // start to iterate from the top right
    // the largest in the row
    int i = 0, j = n - 1; 
    // while the current cell is in the matrix boundary 
    while (i < m && j >= 0){
      // check if found target
      if (matrix[i][j] == target){
        return true; 
      } 
      // since sorted, if the cell is greater then move left
      else if (matrix[i][j] > target){
        j --; 
      }
      // if the cell is smaller then move down
      else{
        i ++; 
      }
    }
    return false; 
  }
}