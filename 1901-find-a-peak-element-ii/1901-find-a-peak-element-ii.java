class Solution {
    public int[] findPeakGrid(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int lo = 1,hi = (m*n) - 2;
        int max = Integer.MIN_VALUE;
        int[] ans = new int[2];
        for(int i = 0;i< n ; i++){
            for(int j=0;j<m;j++){
                if(max < arr[i][j]){
                    max = arr[i][j];
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna