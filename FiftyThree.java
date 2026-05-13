import java.util.Scanner;

public class FiftyThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
       
        
        for(int i = 1; i<= n ; i++){
            int num =i;
            for( int j =1; j<= i ; j++){
                System.out.print(num + " ");
                num = num+5-j;
            } 
            System.out.println();
    }
        sc.close();
}
}
