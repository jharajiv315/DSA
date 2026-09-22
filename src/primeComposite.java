import java.util.Scanner;

public class primeComposite {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.println("Factors");
        for (int i=1;i<=Math.sqrt(n);i++){
            if (n%i==0){
                System.out.println(+ i);
                System.out.println(n/i);

            }
        }
    }
}
