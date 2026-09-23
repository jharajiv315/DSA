class Solution {
    int search(int[] arr, int target) {
        // code here
        int lo = 0;
              int hi = arr.length -1;

              while(lo<=hi){
                  int mid = (lo+hi)/2;
                  if(arr[mid] == target) return mid;
                 else if(arr[lo] <= arr[mid]){
                 if(arr[lo] <= target && arr[mid] >= target){
                  hi = mid -1;
                 }
                 else{

                  lo = mid + 1;
                 }
                 }
                 else{
                     if(arr[mid] <= target && arr[hi] >= target){
                      lo = mid + 1;

                 }
                 else{

                   hi = mid -1;
                 }

                 }
              }
              return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna