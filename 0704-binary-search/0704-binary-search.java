class Solution {
    public int search(int[] arr, int target) {

        int lo = 0;
        int hi = arr.length - 1;

        while (lo <= hi) {

            int mid = lo + (hi - lo) / 2;

            if (arr[mid] > target) {
                // Target is on the left
                hi = mid - 1;

            } else if (arr[mid] < target) {
                // Target is on the right
                lo = mid + 1;

            } else {
                // Target found
                return mid;
            }
        }

        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna