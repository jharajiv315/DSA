import java.util.Scanner;

public class hollowRectangle {
    //  print this
//* * * * *
//*       *
//*       *
//*       *
//* * * * *
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        System.out.println("Enter a number ");
        int m = sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= m ; j++) {
                if (i ==1||j==1||i==n||j==m) {

                System.out.print("* ");
                }
                else System.out.print("  ");
            }
            System.out.println();


        }
    }
}
