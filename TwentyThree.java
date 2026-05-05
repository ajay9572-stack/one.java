import java.util.Scanner;

class TwentyThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers: ");
        int n = sc.nextInt();

        int max = Integer.MIN_VALUE;

        for(int i = 1; i <= n; i++) {
            System.out.print("Enter number: ");
            int num = sc.nextInt();

            if(num > max) {
                max = num;
            }
        }

        System.out.println("Largest = " + max);
    }
}