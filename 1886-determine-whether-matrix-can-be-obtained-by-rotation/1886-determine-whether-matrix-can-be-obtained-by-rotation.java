class Solution {

    public boolean isEqual(int[][] arr, int[][] target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] != target[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean findRotation(int[][] arr, int[][] target) {

        int n = arr.length;
        int cnt = 0;

        while (cnt < 4) {

            // Transpose the matrix
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }

            // Reverse each row
            for (int row = 0; row < n; row++) {
                int i = 0;
                int j = n - 1;

                while (i < j) {
                    int temp = arr[row][i];
                    arr[row][i] = arr[row][j];
                    arr[row][j] = temp;

                    i++;
                    j--;
                }
            }

            // Check after completing one 90° rotation
            if (isEqual(arr, target)) {
                return true;
            }

            cnt++;
        }

        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna