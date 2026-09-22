public class selectionSort {
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
        for (int i = 0; i <n-1 ; i++) {
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for (int j = i; j <n ; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    mindx = j;

                }

            }
            int temp = arr[mindx];
            arr[mindx] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);

    }
}
