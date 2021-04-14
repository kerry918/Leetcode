class Solution {
public:
  int candy(vector<int>& ratings) {
    int size = ratings.size(); 
    // create a vector with same size of all 1
    vector<int> ans(size, 1); 
    // compare each from left to right
    for (int i = 1; i < size; i++){
      // if the child on the right has higher rating than the left
      if (ratings[i] > ratings[i-1]){
        // add 1 based on the candy amount from the left child
        ans[i] = ans[i-1] + 1; 
      }
    }
    // compare each from right to left
    for (int i = size-1; i > 0; i--){
      // if the child on the left has higher rating and has less or equal amount of candy
      if (ratings[i] < ratings[i-1] && ans[i-1] <= ans[i]){
        // add 1 based on the candy amount from the right child
        ans[i-1] = ans[i] + 1; 
      }
    }
    return accumulate(ans.begin(), ans.end(), 0);  // std::accumulate can calculate the sum 
  }
};