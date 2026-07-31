class Solution {
    public ArrayList<ArrayList<Integer>> multiplyMatrices(int[][] a, int[][] b) {
        // code here
         ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
         int n = a.length;
        
        
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>();
        
            for (int j = 0; j < n; j++) {
                int sum = 0;
        
                for (int k = 0; k < n; k++) {
                    sum += a[i][k] * b[k][j];
                }
        
                row.add(sum);
            }
        
            ans.add(row);
        }
        
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna