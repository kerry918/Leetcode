class Solution {
public:
    vector<int> createTargetArray(vector<int>& nums, vector<int>& index) {
        std::vector<int> ans; 
        ans.push_back(nums[0]); 
        for (int i = 1; i < nums.size(); i++){
            ans.insert(ans.begin() + index[i], nums[i]);             
        }
        return ans; 
    }
};
