class Solution {
  public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    // create result list
    List<List<Integer>> res = new ArrayList<>(); 
    // sort the list
    Arrays.sort(candidates); 
    // helper function
    helper(res, new ArrayList<>(), candidates, target, 0); 
    return res; 
  }
  
  // helper function
  private void helper(List<List<Integer>> res, List<Integer> tmp, int[] candidates, int target, int index){
    if(target <= 0){
      if(target == 0) {
        res.add(new ArrayList<>(tmp)); 
      }
      
      return; 
    }
    
    // loop through the candidates
    for (int i = index; i < candidates.length; i++){
      // skip same number
      if( i > index && candidates[i] == candidates[i-1]) continue; 
      tmp.add(candidates[i]); 
      helper(res, tmp, candidates, target - candidates[i], i + 1); 
      tmp.remove(tmp.size() - 1); 
    }
  }
}