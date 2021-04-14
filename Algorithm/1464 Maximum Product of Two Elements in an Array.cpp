class Solution {
  public:
    int maxProduct(vector<int>& nums) {
        int max_1 = 0, max_1_index = 0; 
        int max_2 = 0, max_2_index = 0; 
        
        for (int i = 0; i < nums.size(); i++){
            if (nums[i] > max_1){
                max_1 = nums[i]; 
                max_1_index = i; 
            }
        }
        for (int i = 0; i < nums.size(); i++){
            if (nums[i] > max_2 && i != max_1_index){
                max_2 = nums[i]; 
                max_2_index = i; 
            }
        }
        return (nums[max_1_index] - 1) * (nums[max_2_index] - 1); 
    }
};
