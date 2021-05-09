class MinStack {
private: 
  stack<int> s, min_s; 

public:
  /** initialize your data structure here. */
  MinStack() {
      
  }
  
  void push(int val) {
    s.push(val); 
    if (min_s.empty() || min_s.top() >= val){
      min_s.push(val); 
    }
  }
  
  void pop() {
    // check if min stack have the value to be popped
    if (!min_s.empty() && min_s.top() == s.top()){
      min_s.pop(); 
    }
    s.pop(); 
  }
  
  int top() {
    return s.top(); 
  }
  
  int getMin() {
    return min_s.top(); 
  }
};

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack* obj = new MinStack();
 * obj->push(val);
 * obj->pop();
 * int param_3 = obj->top();
 * int param_4 = obj->getMin();
 */