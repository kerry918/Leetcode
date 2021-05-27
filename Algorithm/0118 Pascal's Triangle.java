class Solution {
    public List<List<Integer>> generate(int numRows) {
        // declare the final integer list
        List<List<Integer>> ans = new ArrayList<List<Integer>>(); 
        
        // initialize the first inner list (everytime there's 1)
        List<Integer> row_i = new ArrayList<>(); 
        row_i.add(1); 
        // add the row into the answer list
        ans.add(row_i); 
        
        // loop through the numRows (start with the second row)
        for (int i = 1; i < numRows; i++){
            // create a new inner list
            List<Integer> row = new ArrayList<>(); 
            // always start with 1
            row.add(1); 
            
            // loop through the inner part of the row (loop for the upper row size - 1)
            for (int j = 1; j < ans.get(i-1).size(); j++){
                // add the last row's two numbers
                row.add(ans.get(i-1).get(j) + ans.get(i-1).get(j-1)); 
            }
            
            // add the last 1
            row.add(1); 
            // add the row to the answer list
            ans.add(row); 
        }
        return ans; 
    }
}