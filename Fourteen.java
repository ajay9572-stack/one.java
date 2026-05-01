import java.util.Scanner;
   // program to print multiplication table of a number
class Fourteen {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(t + " x " + i + " = " + t * i);
        }

    }
}
