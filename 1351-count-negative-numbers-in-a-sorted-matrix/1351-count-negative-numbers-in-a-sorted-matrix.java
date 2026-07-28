class Solution {
    public int countNegatives(int[][] mat) {
        int count = 0;
        int m = mat.length;
        int n = mat[0].length;
        for(int i = 0;i<m;i++){
            for(int j = 0; j< n;j++){
                if(mat[i][j] < 0){
                    count ++;
                }
                
                
                
            }
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna