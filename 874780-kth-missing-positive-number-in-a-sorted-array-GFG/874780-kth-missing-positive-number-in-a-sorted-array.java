class Solution {
    public int kthMissing(int[] arr, int k) {
        // code here
        int n= arr.length;
        int lo = 0,hi = n-1;
           while(lo<=hi){
            int mid = (hi+lo)/2;
            int missing = arr[mid] - (mid + 1);
            if(missing < k) lo = mid + 1;
            else hi = mid -1;
           }
           return lo + k;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna