class Solution {
  public int findCircleNum(int[][] isConnected) {
    // initialize a set to check if a province has been visitied
    Set<Integer> visited = new HashSet<>(); 
    
    int num = 0; 
    for (int i = 0; i < isConnected.length; i++){
      if(!visited.contains(i)){
        dfs(i, isConnected, visited); 
        ++ num; 
      }
    }
    return num; 
  }
  
  // helper function
  private void dfs(int city, int[][] isConnected, Set<Integer> visited){
    // check if has been visited
    if(visited.contains(city))
      return ; 
    
    visited.add(city); 
    // loop through the provinces
    for(int i = 0; i < isConnected.length; i++){
      if(isConnected[city][i] != 0){
        dfs(i, isConnected, visited); 
      }
    }
  }
}