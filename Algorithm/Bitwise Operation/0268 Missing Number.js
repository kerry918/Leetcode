/**
 * @param {number[]} nums
 * @return {number}
 */
var missingNumber = function(nums) {
  // total of the index if nothing missing
  let sumIfNoneMissing = nums.length; 
  // actual sum of nums
  let actualSum = 0; 
  
  // loop through the array
  for (let i = 0; i < nums.length; i++){
    sumIfNoneMissing += i; 
    actualSum += nums[i]; 
  }
  
  return sumIfNoneMissing - actualSum; 
};