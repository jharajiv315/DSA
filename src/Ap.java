import java.util.Scanner;

public class Ap {
public static void main(String[] args){
    Scanner sc =  new Scanner(System.in) ;
    System.out.println("Enter a number");
    int n = sc.nextInt();
    // 2 5 8 11...
//    int a = 2;
//    int d = 3;
//    for (int i=1;i<=n;i++){
//        System.out.println(a);
//        a+=d;
//    }
//    Print numbers from 1 to n
//    for(int i=n;i>=1;i--){
//        System.out.print(i + " ");
//    }
//    Sum of first n numbers
    int sum = 0;
    for(int i=1;i<=n;i++){
        sum +=i;

    }
    System.out.println(sum);

}
}



