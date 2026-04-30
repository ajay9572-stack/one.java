import java.util.Scanner;
     //program to create calculator using switch case and do while loop
public class Thirteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        String yn;

        do {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            System.out.println("Select operator (+, -, *, /): ");
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
                    if (b != 0) {
                        res = a / b;
                        System.out.println("Div = " + res);
                    } else {
                        System.out.println("Cannot divide by zero");
                    }
                    break;
                default:
                    System.out.println("Invalid operator");
                    break;
            }

            System.out.println("Do you want to continue (press y for yes and n for no)");
            yn = sc.next();
        } 
        while (yn.equals("y") || yn.equals("Y")); 

        sc.close();
    }
}