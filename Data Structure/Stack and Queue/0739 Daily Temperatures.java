class Solution {
  public int[] dailyTemperatures(int[] T) {
    // declare a stack to store the temperature's indicies
    Stack<Integer> stack = new Stack<Integer>(); 
    // initialize the answer array
    int[] arr = new int[T.length]; 
    
    // loop through the array from right to left and check the temp accordingly
    for (int i = T.length-1; i >= 0; i--){
      // pop the indicies if the temperature is lower than the current temp
      while(!stack.empty() && T[i]>=T[stack.peek()]){
        stack.pop(); 
      }
      // if the current stack is empty (no higher temp)
      if(stack.isEmpty()){
        arr[i] = 0;                 
      }
      else {
        arr[i] = stack.peek() - i; 
      }
      // push the indicies onto the stack
      stack.push(i); 
    }
    return arr; 
  }
}