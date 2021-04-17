class Solution {
public:
  int findMin(vector<int> &num) {
    return findMin(num, 0, num.size()-1);
  }
  
  int findMin(const vector<int>& num, int l, int r)
  {
    // One or two elements, solve it directly
    if (l+1 >= r) return
      min(num[l], num[r]);
    
    // Sorted
    if (num[l] < num[r])
      return num[l];
    
    // find the mid point
    int m = l + (r-l)/2;
    
    // Recursively find the solution
    return min(findMin(num, l, m - 1), findMin(num, m, r));
  }
};