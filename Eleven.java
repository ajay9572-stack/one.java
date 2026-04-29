import java.util.Scanner;
public class Eleven {
 // Write a Java program to perform basic arithmetic operations (addition, subtraction, multiplication, division) on two numbers input by the user.
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;  
        int div = a / b;
        System.out.println("Sum = " + sum);
        System.out.println("Sub = " + sub); 
        System.out.println("Mul = " + mul);
        System.out.println("Div = " + div);
        sc.close();
  }  
}
