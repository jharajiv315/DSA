public class array_09 {
//    Q : Rotate array
static void main(String[] args) {
    int r = 4;
    int[] arr = {41,52,5,6,7,8,5,3,67};
    for (int i = 0; i < r; i++) {
        arr[i] = arr[arr.length-1];

    }
    for (int e : arr) System.out.print(arr[e]+" ");
}
}
