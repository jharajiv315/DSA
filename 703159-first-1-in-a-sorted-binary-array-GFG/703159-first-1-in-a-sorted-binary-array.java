class Solution {
    public int firstIndex(int arr[]) {
       for(int i =0;i<arr.length;i++){
           if(arr[i]==1) return i;
       }
       return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna