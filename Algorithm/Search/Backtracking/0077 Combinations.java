class Solution {
  public List<List<Integer>> combine(int n, int k) {
    // initialize the answer list
    List<List<Integer>> res = new ArrayList<>(); 
    // Base case
    if (k > n) return res; 
    // backtracking and depth first serach
    dfs(n, k, res, new ArrayList<Integer>(), 1);  // index starts with 1 
    return res; 
  }
  
  // helper function (dfs)
  private void dfs(int n, int k, List<List<Integer>> res, List<Integer> subset, int index){
    // return when the combination size reaches the required k 
    if (subset.size() == k){
      // add the subset(combination) to the answer list
      res.add(new ArrayList<Integer>(subset)); 
      return; 
    }
    
    // loop through the current number until n 
    for (int i = index; i <= n; i++){
      subset.add(i);  // append the current number
      dfs(n, k, res, subset, i+1); // recursively combine
      subset.remove(subset.size() - 1); // remove the appended number to backtrack
    }
  }
}