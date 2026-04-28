public class Seven {
    // find the leap year
    public static void main(String[] args) {
        int year = 2016;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println( " is a leap year.");
        } else {
            System.out.println( " is not a leap year.");
        }
    }
}
