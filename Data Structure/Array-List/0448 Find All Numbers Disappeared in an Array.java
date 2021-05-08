class Solution {
  public List<Integer> findDisappearedNumbers(int[] nums) {
    List<Integer> missingNumbers = new ArrayList<Integer>(); 
    // declare a hash set to store (and duplicates willnot appear twice)
    HashSet<Integer> numbers = new HashSet<Integer>(); 
    // add all numbers in nums into the hash set
    for (int i : nums){
      numbers.add(i); 
    }
    
    // loop through the numbers and check which ones are not in the hash set
    for (int i = 1; i <= nums.length; i ++){
      if (!numbers.contains(i)){
        missingNumbers.add(i); 
      }
    }
    
    return missingNumbers; 
  }
}