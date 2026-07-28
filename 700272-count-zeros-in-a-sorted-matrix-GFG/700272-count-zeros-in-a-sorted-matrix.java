class Solution {
    public int countZeros(int[][] mat) {
        // code here
        int count = 0;
        int n = mat.length;
        for(int i = 0;i<n;i++){
            for(int j = 0; j< n;j++){
                if(mat[i][j] == 0){
                    count ++;
                }
                if(mat[i][j]==1) break;
                
                
            }
        }
        return count;
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna