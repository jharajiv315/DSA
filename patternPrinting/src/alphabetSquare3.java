import java.util.Scanner;

public class alphabetSquare3 {
    //    print this
    //    A A A A
//    B B B B
//    C C C C


    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int alphabet =65;

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {

                System.out.print((char)(i+64) +" ");

            }

            System.out.println();

        }
    }
}
