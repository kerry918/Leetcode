class Solution {
  public void rotate(int[][] matrix) {
    // get the length of the matrix
    int N = matrix.length; 
    
    // transpose the matrix 
    for (int i = 0; i < N; i ++){
      for (int j = i; j < N; j++){
        int temp = matrix[i][j]; 
        matrix[i][j] = matrix[j][i]; 
        matrix[j][i] = temp; 
      }
    }
    
    // swap the left and right of each row
    for (int i = 0; i < N; i ++){
      for (int j = 0; j < (N/2); j ++){
        int temp = matrix[i][j]; 
        matrix[i][j] = matrix[i][N-1-j]; 
        matrix[i][N-1-j] = temp; 
      }
    }
  }
}