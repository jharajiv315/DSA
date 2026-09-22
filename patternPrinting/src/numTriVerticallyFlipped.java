import java.util.Scanner;

public class numTriVerticallyFlipped {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n + -i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (i+64)+" ");// alphabets
              //  System.out.print(j+" ");// number

            }

            System.out.println();

        }
    }
}
