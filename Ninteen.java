 import java.util.Scanner;

public class Ninteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int no = sc.nextInt();

        int temp = 0;

        for (int i = 2; i <= no - 1; i++) {
            if (no % i == 0) {
                temp = temp + 1;
            }
        }

        if (temp > 0) {
            System.out.println("Not prime");
        } else {
            System.out.println("Number is prime");
        }
    }
} 
    

