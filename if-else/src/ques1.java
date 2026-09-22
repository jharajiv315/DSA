import java.util.Scanner;

public class ques1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ");
        int n = sc.nextInt();
//        Take positive integer input and
//        tell if it is odd or even
        if(n%2==0){
            System.out.println("Even");
        }
        else System.out.println("Odd");
    }
}
