class Solution {
    public int findCeil(int[] arr, int x) {
        // code here
       int lo = 0, hi = arr.length-1,idx=-1;
              while(lo<=hi){
                  int mid = (lo+hi)/2;
                  if(arr[mid]<x) lo = mid + 1;
                  else {
                      idx = mid;
                      hi = mid -1;
                  }
              }
              return idx;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna