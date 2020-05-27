class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
		// create a has table  (map) 
        map<int, int> s; 
		// create a empty vector set
        vector<int> ans; 
		// loop through the vector of numbers
        for (int i = 0; i < nums.size(); i++){
			// s.find() is to find if the certain value is inside the hash table
			// if equal to s.end() means the value is not contained within the hash table
			// if not equal then it is inside the hash table 
            if(s.find(target-nums[i]) != s.end()){
				// push the index of the two numbers 
                ans.push_back(s[target-nums[i]]); 
                ans.push_back(i); 
                return ans; 
            }
			// if the value is not inside the hash table
            else{
				// then add the value to the corresponding index in the has table
				// with a value of the index in the vector array 
                s[nums[i]] = i; 
            }
        }
        return ans; 
    }
};
