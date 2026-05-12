import java.util.Scanner;

public class FourtyNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
            
        int count = 0;
        for ( int i = 0; i <= n; i++){
            for ( int j = 1; j <= i + 1; j++){
                count = count + 1;
                System.out.print(count + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
