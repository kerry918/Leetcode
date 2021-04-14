class Solution {
public:
    bool isPowerOfTwo(int n) {
        if(n==0)
            return false;
        else{
            return ceil(log2(n)) == floor(log2(n));
        }
    }
};
