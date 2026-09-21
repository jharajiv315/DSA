class Solution {
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
        }
  

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna