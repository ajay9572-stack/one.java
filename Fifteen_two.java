import java.util.Scanner;
public class Fifteen_two {
    // program to find factorial of a number with decrementing loop4
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int fact = 1;
        for (int i = n; i>=1; i--){
            fact = fact*i;
        }
        System.out.println(fact);
        sc.close();
    }
}
