class Solution {

    public int inversionCount(int arr[]) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    public int mergeSort(int arr[], int lo, int hi) {

        if (lo >= hi) {
            return 0;
        }

        int mid = (lo + hi) / 2;

        int cnt = 0;

        cnt += mergeSort(arr, lo, mid);
        cnt += mergeSort(arr, mid + 1, hi);
        cnt += merge(arr, lo, mid, hi);

        return cnt;
    }

    public int merge(int arr[], int lo, int mid, int hi) {

        int i = lo;
        int j = mid + 1;
        int cnt = 0;

        int temp[] = new int[hi - lo + 1];
        int k = 0;

        while (i <= mid && j <= hi) {

            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } 
            else {
                temp[k++] = arr[j++];

                // All remaining elements in left half
                // will form an inversion with arr[j-1]
                cnt += (mid - i + 1);
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= hi) {
            temp[k++] = arr[j++];
        }

        for (i = lo; i <= hi; i++) {
            arr[i] = temp[i - lo];
        }

        return cnt;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna