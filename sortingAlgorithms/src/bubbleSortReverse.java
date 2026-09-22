public class bubbleSortReverse {
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    static void main(String[] args) {
        boolean isSorted = true;
        int[] arr = {42,52,63,73,2,7,84,9,-2,-62,45};
        for (int i = 0; i < arr.length - 1 ; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = false;
                }

            }
            if (isSorted ) break;

        }
        printArray(arr);

    }
}
