class Solution {
    public int findMin(int[] arr) {
        int lo = 0;
        int hi = arr.length -1;
        int mn = Integer.MAX_VALUE;
        while(lo<=hi){
            int mid = (lo+hi)/2;
           if(arr[lo] <= arr[mid]){
            mn  = Math.min(mn,arr[lo]);
            lo = mid + 1;
           }
           else{
                hi = mid - 1;
                mn = Math.min(mn,arr[mid]);
           }
        }
        return mn;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna