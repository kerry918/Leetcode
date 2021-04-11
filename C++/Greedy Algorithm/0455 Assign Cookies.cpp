class Solution {
public:
    int findContentChildren(vector<int>& children, vector<int>& cookies) {
        // First sort the two vectors for easy comparison
        sort(children.begin(), children.end()); 
        sort(cookies.begin(), cookies.end()); 
        // define counter
        int child = 0, cookie = 0; 
        // while the counter is smaller than the size of the vector
        while (child < children.size() && cookie < cookies.size()){
            // check if the child is satisfied with the cookie size (if yes, child ++)
            if (children[child] <= cookies[cookie]) child++; 
            // move the cookie counter
            cookie ++; 
        }
        return child; 
    }
};