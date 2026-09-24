class Solution {
    public int singleNonDuplicate(int[] arr) {
        int n = arr.length;
        if(n==1) return arr[0];

        // Single element is at the beginning
        if (arr[0] != arr[1]) {
            return arr[0];
        }

        // Single element is at the end
        if (arr[n - 1] != arr[n - 2]) {
            return arr[n - 1];
        }

        int lo = 1;
        int hi = n - 2;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
                return arr[mid];
            }

            // mid is even → pair should start at mid
            if (mid % 2 == 0) {
                if (arr[mid] == arr[mid + 1]) {
                    lo = mid + 2;
                } else {
                    hi = mid - 1;
                }
            }

            // mid is odd → pair should end at mid
            else {
                if (arr[mid] == arr[mid - 1]) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
        }

        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna