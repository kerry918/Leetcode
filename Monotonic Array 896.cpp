class Solution {
public:
    bool isMonotonic(vector<int>& A) {
        bool trueFalse1 = true; 
        bool trueFalse2 = true;         
        
        for (int i=0; i<A.size()-1; ++i){
            if (A[i]<A[i+1])
                trueFalse1 = false; 
            else if (A[i]>A[i+1])
                trueFalse2 = false; 
        }
        
        return trueFalse1||trueFalse2; 
    }
};
