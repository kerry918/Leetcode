class Solution {
public:
  vector<int> partitionLabels(string S) {
    // initialize a vector to store the last index of every character
    vector<int> last_index(128, 0); 
    // loop through the string to store the last occuring index of each character
    for (int i = 0; i < S.size(); i++){
      last_index[S[i]] = i; 
    }
    // initialize 
    vector<int> ans; 
    int start = 0, end = 0; 
    for (int i = 0; i < S.size(); i++){
      // update the end with the maximum index 
      end = max(end, last_index[S[i]]); 
      // when it reaches to the last index of certain character
      if (i == end){
        // store the length in
        ans.push_back(end - start + 1); 
        // update the starting point
        start = end + 1; 
      }
    }
    return ans; 
  }
};