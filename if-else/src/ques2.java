import java.util.Scanner;

public class ques2 {
    static void main(String[] args) {
//        Take positive integer input and tell
//        if it is divisible by 5 or not.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if (n %5== 0) {
            System.out.println("Divisible by 5");

        }
        else System.out.println("not divisble");
    }
}
