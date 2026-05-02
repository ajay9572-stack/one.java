import java.util.Scanner;

class FactorialByRecursion {
    static int fact = 1;
      // find the factorial of a number using recursion
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no: ");
        int no = s.nextInt();

        FactorialByRecursion ob = new FactorialByRecursion();
        ob.calcFact(no);

        System.out.println("factorial of " + no + " is " + fact);
        s.close();
    }

    void calcFact(int no) {
        if (no >= 1) {
            fact = fact * no;
            calcFact(no - 1);
        }
    }
    
}