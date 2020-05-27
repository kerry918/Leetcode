class MyQueue {
private: 
    stack<int> s1,s2; 
    const int EMPTY = -999; 
public:
    /** Initialize your data structure here. */
    MyQueue() {
        
    }
    
    /** Push element x to the back of queue. */
    void push(int x) {
        s1.push(x); 
    }
    
    /** Removes the element from in front of queue and returns that element. */
    int pop() { 
        int temp = peek(); 
        s2.pop(); 
        return temp; 
    } 
    
    /** Get the front element. */
    int peek() {
        if(s2.empty()){
            while(!s1.empty()){
                s2.push(s1.top()); 
                s1.pop(); 
            }
        }
        int temp = s2.top(); 
        
        return temp; 
    }
    
    /** Returns whether the queue is empty. */
    bool empty() {
        return s1.empty()&&s2.empty(); 
    }
};

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue* obj = new MyQueue();
 * obj->push(x);
 * int param_2 = obj->pop();
 * int param_3 = obj->peek();
 * bool param_4 = obj->empty();
 */
