class Solution {
public:
  void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
    // initialize pointer at the last point of nums1 array 
    // set m and n pointers at the last number of both arrays
    int pos = m-- + n-- - 1; 
    // while both array have numbers
    while(m >= 0 && n >= 0){
      // put the larger number of the last number from either array to the last position of nums1
      nums1[pos--] = nums1[m] > nums2[n] ? nums1[m--] : nums2[n--]; 
    }
    // when nums1 array is empty, copy over all the nums2 array to nums1
    // update the pointer of pos and n as looping through
    while(n >= 0){
      nums1[pos--] = nums2[n--]; 
    }
  }
};

// a++ will return a (and update next)
// ++a will return a+1 (update first then assign)