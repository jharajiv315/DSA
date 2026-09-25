class Solution {
    public int countNegatives(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int c = 0 ,  r = n - 1;
        int cnt = 0;
        while(r >= 0 && c < m){
        if(mat[r][c] < 0){
            r--;
            cnt += m - c;
        }
        else c++;
        }
       
        return cnt;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna