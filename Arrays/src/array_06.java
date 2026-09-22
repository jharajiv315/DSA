public class array_06 {

    //    Q : Print the Maximum element in the array
    static void main(String[] args) {
        int[] arr = {31, 4, 53, 63, 1, 85, 95, 41};
        int max = arr[0];
        boolean flag =false;
        for (int i = 1;i <arr.length ; i++) {
            if (arr[i]> max) {
                max = arr[i];

            }
        }
        System.out.println(max);
    }
}
