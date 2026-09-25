class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        int min = Integer.MAX_VALUE;
        // for(int i = 0; i < arr.length; i++){
        //     min = Math.min(arr[i],min);
        // }
        // for(int i =  1; i < arr.length;i++){
        //     if(arr[i]==min) return i;
        // }
        // return 0;
        int low = 0;
        int high = arr.length-1;
        int idx = -1;
        while(low<=high){
        
            int mid = (low + high )/2;
            if(arr[low]<=arr[high]){
               if(arr[low] < min){
                   min = arr[low];
                   idx = low;
               }
               break;   
            }
            if(arr[low]<=arr[mid]){
                 if(arr[low] < min){
                    min = arr[low];
                   idx = low;
               }
               low = mid + 1;
            }
            else {
                high = mid - 1;
                 if(arr[mid] < min){
                    min = arr[mid];
                   idx = mid;
               }
            }
        }
        return idx;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna