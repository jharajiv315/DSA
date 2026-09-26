class Solution {
    public int[] findPeakGrid(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int lo = 0, hi = m - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            int row = max(arr, n, m, mid);

            int left = mid - 1 >= 0 ? arr[row][mid - 1] : -1;
            int right = mid + 1 < m ? arr[row][mid + 1] : -1;

            if (arr[row][mid] > left && arr[row][mid] > right) {
                return new int[]{row, mid};
            } else if (arr[row][mid] < left) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        return new int[]{-1, -1};
    }

    public int max(int[][] arr, int n, int m, int mid) {
        int max = -1;
        int idx = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i][mid] > max) {
                max = arr[i][mid];
                idx = i;
            }
        }

        return idx;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna