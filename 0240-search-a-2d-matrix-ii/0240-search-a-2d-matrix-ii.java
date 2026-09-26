class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
          int n = mat.length;
        int m = mat[0].length;
        int lo = 0;
        int hi = (n * m) - 1;
        for(int i = 0; i < n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==target) return true;
            }
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna