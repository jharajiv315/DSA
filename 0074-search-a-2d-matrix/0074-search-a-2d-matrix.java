class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int n = mat.length;
        int m = mat[0].length;
        int lo = 0;
        int hi = (n * m) - 1;
        while(lo<=hi){
            int mid = (lo + hi) / 2;
            int row = mid / m;
            int col = mid % m;
            if(mat[row][col] == target){
                return true;
            }
            else if(mat[row][col] > target){
                hi = mid -1;
            }
            else lo = mid + 1;
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna