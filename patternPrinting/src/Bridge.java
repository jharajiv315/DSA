import java.util.Scanner;

public class Bridge {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        int nsp =1,nst = n-1;
        for (int i =1; i <=(2*n)-1 ; i++) {
            System.out.print("* ");

        }
        System.out.println();
        for (int i = 1; i <=n-1 ; i++) {
            for (int j = 1; j <=nst ; j++) {
                System.out.print("* ");

            }
            for (int j = 1; j <=nsp ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=nst ; j++) {
                System.out.print("* ");

            }
            System.out.println();
            nsp+=2;
            nst--;

        }
    }
}
