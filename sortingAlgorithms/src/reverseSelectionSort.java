public class reverseSelectionSort {
    static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();

    }
    static void main(String[] args) {
        int[] arr = {2,6,-3,36,25,6,62,-6};
        int n = arr.length;
        printArray(arr);
        for (int i = 0; i <=n ; i++) {
            int max = Integer.MIN_VALUE;
            int maxdx = -1;
            for (int j = n-i; j <i ; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    maxdx = j;

                }

            }
            int temp = arr[maxdx];
            arr[maxdx] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
        printArray(arr);

    }
}
