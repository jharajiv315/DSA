import java.util.Scanner;

public class sumOFdigits {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int sum =0;
        int temp ;
        temp = n;
        while (temp!=0){
            temp=temp%10;

            sum = temp + sum;
        }
        System.out.println(sum + " digits");
    }
}
