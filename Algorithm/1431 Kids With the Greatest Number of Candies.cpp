class Solution {
public:
    vector<bool> kidsWithCandies(vector<int>& candies, int extraCandies) {
        int max_candy = 0; 
        vector<bool> max; 
        for (int i = 0; i < candies.size(); i++){
            if (candies[i] > max_candy){
                max_candy = candies[i]; 
            }
        }
        for (int i = 0; i < candies.size(); i++){
            if (candies[i] + extraCandies >= max_candy){
                max.push_back(true); 
            }
            else{
                max.push_back(false); 
            }
        }
        return max; 
    }
};
