class Solution {
public:
    vector<int> decompressRLElist(vector<int>& nums) {
        int n = nums.size() / 2; 
        vector<int> ans; 
        for (int i = 0; i < n; i++){
            for (int j = 0; j < nums[2*i]; j++){
                ans.push_back(nums[2*i + 1]); 
            }
        }
        return ans; 
    }
};
