import java.util.Scanner;

public class FourtyThreee {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <2*i; k++) {
                if(k==1 || k==2*i-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
    }
    sc.close();
    }
}
