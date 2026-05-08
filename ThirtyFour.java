import java.util.Scanner;

public class ThirtyFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {

            // spaces
            for(int j = 1; j < i; j++) {
                System.out.print("  ");
            }

            // stars
            for(int k = n; k >= i; k--) {
                System.out.print("* ");
            }

            System.out.println();
        }

        sc.close();
    }
}