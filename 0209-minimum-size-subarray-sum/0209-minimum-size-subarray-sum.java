class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int n = arr.length;

        int left = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < n; right++) {

            // Expand the window
            sum += arr[right];

            // Shrink the window while it is valid
            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1);

                sum -= arr[left];
                left++;
            }
        }

        // No valid subarray found
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna