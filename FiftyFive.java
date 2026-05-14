import java.util.Scanner;
public class FiftyFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
          int count = 0;
        for ( int i = 1; i <= n ; i++){
            for( int j = 1; j<= 3; j++){
                count = count +1;
                System.out.print(count + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
