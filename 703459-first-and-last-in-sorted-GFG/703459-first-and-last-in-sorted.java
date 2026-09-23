class Solution {
    ArrayList<Integer> find(int arr[], int target) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
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
               ans.add(first);
               ans.add(last);
               return ans;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna