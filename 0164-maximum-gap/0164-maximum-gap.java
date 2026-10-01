class Solution {
    public int maximumGap(int[] arr) {
        int diff = 0;
        Arrays.sort(arr);
        if(arr.length < 2) return 0;
        for(int i = 0;i<arr.length-1;i++){
            diff = Math.max(diff,arr[i+1] - arr[i]);

        }
        if(diff < 0) return 0;
        return diff;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna