import java.util.Scanner;

public class alphabetSquare {
//    print this
//    A B C D
//    A B C D
//    A B C D
//    A B C D
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int alphabet =65;

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {

                System.out.print((char)(j+64) +" ");

            }

            System.out.println();

        }
    }
}
