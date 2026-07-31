class Solution {
    public void addMat(int[][] a, int[][] b) {
        // code here
        int n = a.length;
        for(int i =0;i<n;i++){
            for(int j = 0;j<n;j++){
                a[i][j] +=  b[i][j];
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna