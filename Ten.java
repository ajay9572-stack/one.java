import java.util.Scanner;
public class Ten {
    // take input from user and print it
    public static void main(String[] args)
 {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("i entered: " + n);
        System.out.println("enter name");
        String name = sc.next();
        System.out.println("i entered: " + name);
        System.out.println("enter gender");
        char gender = sc.next().charAt(0);
        System.out.println("i entered: " + gender);
        System.out.println("enter age");
        int age = sc.nextInt();
        System.out.println("i entered: " + age);
        System.out.println("enter phone number");
        long phone = sc.nextLong();
        System.out.println("i entered: " + phone);  
        sc.close();
    }

            
}
