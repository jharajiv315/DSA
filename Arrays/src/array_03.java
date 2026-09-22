import java.util.Scanner;

public class array_03 {
    static void main(String[] args) {
        // Q : Multiply odd indexed elements by 2 and add 10 to even indexed elements

        int[] arr = {23,34,5,2,5,4,74,69,9,16,2};
        for (int i = 0; i <arr.length ; i++) {
            if (i%2 == 0) {
                arr[i]=2*arr[i];
            }
            else {
                arr[i] +=10;
            }
            System.out.print(arr[i]+" ");
        }

    }
}
