class Solution {
public:
  int maxChunksToSorted(vector<int>& arr) {
    // declare ans and current max
    int ans = 0, max_num = 0; 
    // loop through the vector
    for (int i = 0; i < arr.size(); i ++){
      // get the maximum number 
      max_num = max(max_num, arr[i]); 
      // if the maximum number equal the index number -> all the numbers before all appeared
      if (max_num == i){
        ans ++; 
      }
    }
    return ans; 
  }
};