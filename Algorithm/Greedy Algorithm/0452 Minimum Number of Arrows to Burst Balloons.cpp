class Solution {
public:
  int findMinArrowShots(vector<vector<int>>& points) {
    // if points is empty, then no arrow needed
    if (points.empty()) return 0; 
    // sort by the ending point
    sort(points.begin(), points.end(), [](const vector<int>& a, const vector<int>& b){
      return a[1] < b[1]; 
    }); 
    // initialize the pointer to be the first section's ending point
    int right = points[0][1]; 
    // at least one arrow needed
    int ans = 1; 
    // loop through the points vector
    for (int i = 1; i < points.size(); i++){
      // if the start point is greater than the last end point, then new arrow needed
      if (points[i][0] > right){
        right = points[i][1]; 
        ans++; 
      }
    }
    return ans; 
  }
};