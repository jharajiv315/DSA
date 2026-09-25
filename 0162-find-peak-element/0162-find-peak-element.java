class Solution {
    public int findPeakElement(int[] arr) {
        int n = arr.length;
        int lo = 1,hi = n - 2;
        if(n==1) return 0;
        if(arr[0]>arr[1]) return 0;
        if(arr[n-1]>arr[n-2]) return n-1;
        while(lo<=hi){
            int mid = (lo + hi)/2;
            if( arr[mid]>arr[mid  + 1] && arr[mid] > arr[mid - 1]){
                return mid;
            }
            else if ( arr[mid] > arr[mid - 1]) lo = mid + 1;
            else hi = mid - 1;
        }
        return 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna