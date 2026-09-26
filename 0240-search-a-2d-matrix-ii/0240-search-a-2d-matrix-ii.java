class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int n = mat.length;
        int m = mat[0].length;
        
        
       for(int i = 0; i < n; i++ ){
        if(mat[i][0]==target) return true;
        if(binarySearch(mat[i], target))
        return true;
       }
        return false;
    }
     public boolean binarySearch(int[] mat, int target){
        int lo = 0;
        int hi = mat.length - 1;
        while(lo<=hi){
            int mid = (lo + hi) / 2;
            if(mat[mid] == target) return true;
            else if(mat[mid] > target) hi = mid - 1;
            else lo = mid + 1;

        }
        return false;
     }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna