class Solution {
  public void sortColors(int[] nums) {
    if (nums.length < 2) return; 
    
    // index pointing to start and end
    int start = 0; 
    int end = nums.length - 1; 
    int i = 0; 
    
    while (i <= end && start < end){
      if (nums[i] == 0){
        nums[i] = nums[start]; 
        nums[start] = 0; 
        start ++; 
        i ++; 
      }
      else if (nums[i] == 2){
        nums[i] = nums[end]; 
        nums[end] = 2; 
        end --; 
      }
      else {
        i ++; 
      }
    }
  }
}