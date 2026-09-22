

public class array_02 {
//    Q : Print sum of elements of array
static void main(String[] args) {
//    int[] arr = {4,2,7,42,2,7,8,};
//    int n = arr.length;
//    int sum = 0;
//    for (int i = 0; i <n ; i++) {
//        System.out.print("");
//    }
//    System.out.println(sum);
    int[] arr = {2,6,7,-2,5,4,7};
    int sum = 0;
    for (int j : arr) {
        sum += j;
    }
    System.out.println(sum);
}
}
