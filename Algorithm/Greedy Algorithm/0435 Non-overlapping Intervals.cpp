class Solution {
public:
  int eraseOverlapIntervals(vector<vector<int>>& intervals) {
    int size = intervals.size(), remove = 0; 
    // if 0 or 1 interval, then no interval should be removed
    if (size <= 1) return 0; 
    
    // sort by endpoint
    sort(intervals.begin(), intervals.end(), [](const vector<int>& a, const vector<int>& b){
      // put a infront of b when the endpoint of a is less than endpoint of b
      return a[1] < b[1]; 
    }); 
    
    int prevEnd = intervals[0][1]; // initialize the endpoint to the first interval
    // loop the rest of the interval in a for loop
    for (int i = 1; i < size; i++){
      // if the current interval start is less than the previous interval end, then overlap
      if (intervals[i][0] < prevEnd){
          remove ++; 
      }
      // if there is not overlap, update the prevEnd to the current one
      else prevEnd = intervals[i][1]; 
    }
    
    return remove; 
  }
};

// https://www.youtube.com/watch?v=hyQZCTfQDxo