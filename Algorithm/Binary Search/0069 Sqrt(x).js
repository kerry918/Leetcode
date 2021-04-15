/**
 * @param {number} x
 * @return {number}
 */

var mySqrt = function(x) {
  // when number is 0 or 1
  if (x < 2) return x; 
  // set the boundaries
  let left = 1; 
  let right = x; 
  
  // using binary search to find the number
  while(left < right){
    // find the mid point
    // Math.floor rounds down the number
    let mid = left + Math.floor((right- left)/2); 
    
    // check if the mid point square equal x
    if (mid * mid === x){
      return mid; 
    } 
    // discard the right side, when square of mid is greater
    else if (mid * mid > x){
      right = mid; 
    }
    // discard the left side, when square of mid is smaller
    else if (mid * mid < x){
      left = mid + 1; 
    }
  }
  return left - 1; 
};