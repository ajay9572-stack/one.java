import java.util.Scanner;
   // program to find factorial of a number with incrementing loop
public class Fifteem_one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
        sc.close();
    }
}
