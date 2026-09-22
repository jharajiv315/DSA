import java.util.Scanner;

public class array_04 {
    static void main(String[] args) {
        // search in array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to search");
        int x = sc.nextInt();
        int[] arr = {24,52,45,532,5,6,74,18};
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == x) {
                System.out.println("Found "+ x);
                return;

            }

            };

        }
    }

