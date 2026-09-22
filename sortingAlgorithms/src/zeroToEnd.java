public class zeroToEnd {  static void printArray(int[] arr) {
    for (int num : arr) {
        System.out.print(num + " ");
    }
}
    static void main(String[] args) {
        boolean isSorted = true;
        int[] arr = {42,0,10,73,0,7,0,9,-2,0,45};
        for (int i = 0; i < arr.length - 1 ; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] ==0) {
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
