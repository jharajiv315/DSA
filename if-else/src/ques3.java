import java.util.Scanner;

public class ques3 {
//    If cost price and selling price of an
//    item is input through the keyboard, write a
//    program to determine whether the seller
//    has made profit or incurred loss or no profit
//    no loss. Also determine how much profit he
//    made or loss he incurred.
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sp");
        int sp = sc.nextInt();
        System.out.println("Enter cp");
        int cp = sc.nextInt();
        if (cp == sp) {
            System.out.println("Both same");

        } else if (cp>sp) {
            System.out.println("Loss"+ (cp-sp));

        }
        else if (sp>cp) {
            System.out.println("Profit"+(sp-cp));

        }
    }
}
