class Solution {
    public void rotate(int[] nums, int k) {
        int[] newNum = new int[nums.length]; 
        for (int i=0; i<nums.length; i++){ 
            newNum[(i+k)%nums.length]=nums[i]; 
        }
        
        for (int i=0; i<nums.length; i++){
            nums[i]=newNum[i]; 
        }
    }
}
