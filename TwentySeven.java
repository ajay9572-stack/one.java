import java.util.Scanner;

public class TwentySeven {
    // print all armstrong numbers between 1 to n
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int no = 1; no <= n; no++) {
            // Step 1: find length
            int t1 = no;
            int len = 0;

            if (t1 == 0) {
                len = 1; // fix for 0
            } else {
                while (t1 != 0) {
                    t1 = t1 / 10;
                    len++;
                }
            }

            // Step 2: calculate Armstrong sum
            int t2 = no;
            int sum = 0;

            while (t2 != 0) {
                int rem = t2 % 10;

                int mul = 1;
                for (int i = 1; i <= len; i++) {
                    mul = mul * rem;
                }

                sum += mul;
                t2 = t2 / 10;
            }

            // Step 3: check
            if (no == sum) {
                System.out.print(no + " ");
            }
        }
        sc.close();
    }
}