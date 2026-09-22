public class array_07 {

    //    Q : Print the second Maximum element in the array
    static void main(String[] args) {
        int[] arr = {31, 4, 53, 63, 1, 85, 95, 41};
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }

        }
        for (int i = 0; i < arr.length; i++){
            if (arr[i] >smax && arr[i] < max) {
                smax = arr[i];
            }
        }
        System.out.println(smax);

    }

}

