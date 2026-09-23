class Solution {
    int upperBound(int[] arr, int tar) {
        // code here
        int lo = 0,hi= arr.length - 1;
        int idx = 0;

        while (lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]> tar) {
                hi = mid -1;

            }
            else if (arr[mid]<=tar) lo = mid+1;

        }

        return lo;

    }
    int lowerBound(int[] arr, int tar) {

        // code here
        int lo = 0,hi= arr.length - 1;
        int idx = 0;

        while (lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]>= tar) {
                hi = mid -1;

            }
            else if (arr[mid]<tar) lo = mid+1;

        }

        return lo;

    }
    public int[] searchRange(int[] arr, int target) {
    int lb = lowerBound(arr, target);
    int ub = upperBound(arr, target);
    if(lb==arr.length || arr[lb]!=target){
        return new int[]{-1,-1};
    }
    return new int[]{lb,ub-1};
    }
    
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna