import java.util.Scanner;
public class Twelve {
    //program to create calculator using switch case
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("select sym(+,-,*,/)");
        String sym = sc.next();
        int res;
        switch (sym) {
            case "+":
                res = a + b;
                System.out.println("Sum = " + res);
                break;
            case "-":
                res = a - b;
                System.out.println("Sub = " + res);
                break;
            case "*":
                res = a * b;
                System.out.println("Mul = " + res);
                break;
            case "/":
                res = a / b;
                System.out.println("Div = " + res);
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
    }
}
