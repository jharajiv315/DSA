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
    // int lb = lowerBound(arr, target);
    // int ub = upperBound(arr, target);
    // if(lb==arr.length || arr[lb]!=target){
    //     return new int[]{-1,-1};
    // }
    // return new int[]{lb,ub-1};
     int low = 0;
        int high = arr.length-1;
        int first = -1;
        int last = -1;
        while (low <= high) {
            int mid = (low+high)/2;
             if(arr[mid]==target) {
                first = mid;
                high = mid-1;
                
            }
            else if(arr[mid]<target) {
                low = mid+1;
                
            }
            else {
                high = mid-1;
            }

        }
         low = 0;
         high = arr.length-1;
        while (low <= high) {
            int mid = (low+high)/2;
            if(arr[mid]==target) {
                last = mid;
                low = mid+1;
                
            }
            else if(arr[mid]<target) {
                low = mid+1;
                
            }
            else {
                high = mid-1;
            }

        }
        return new int[]{first,last};
    }
    
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna