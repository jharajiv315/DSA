import java.util.Scanner;

public class array_01 {
//    Q : Given an array ,print only negative no.
static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 5 numbers ");
    int[] arr = new int[5];
    for (int i = 0; i < 5; i++) {
        arr[i] = sc.nextInt();
    }
    for (int i = 0; i < 5; i++) {
        if (arr[i] < 0) {
            System.out.println(arr[i]);
        }

    }
}
}
