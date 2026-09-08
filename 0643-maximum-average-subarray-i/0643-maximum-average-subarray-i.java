class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int sum = 0;

        // Calculate sum of first window
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;

        // Slide the window
        for (int right = k; right < nums.length; right++) {

            sum += nums[right];       // add new element
            sum -= nums[right - k];   // remove old element

            maxSum = Math.max(maxSum, sum);
        }

        return (double) maxSum / k;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna