class Solution {
    public int[][] transpose(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        int[][] mat = new int[col][row];
        for(int i =0; i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                mat[i][j] = arr[j][i];
            }
        }
        return mat;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna