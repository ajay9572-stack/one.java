import java.util.Scanner;
// print first n Fibonacci numbers using recursion

public class TwentySix {
    static int a = 0, b = 1, c;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print(a + " " + b + " ");

        TwentySix ob = new TwentySix();
        ob.printfib(n - 2);  
    }

    void printfib(int i) {
        if (i > 0) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
            printfib(i - 1);
        }
    }
}