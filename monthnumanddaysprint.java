import java.util.Scanner;

public class monthnumanddaysprint {
    public static void main(String[] args) {
        // enter month num and print number of days in a month
        // input month num 1---->january = 31days output
        int n;
        System.out.print("Enter a number of month ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        if (n == 1) {
            System.out.println("jan = 31 days ");
        } else if (n == 2) {
            System.out.println("feb = 28 days ");
        } else if (n == 3) {
            System.out.println("march = 31 days ");
        } else if (n == 4) {
            System.out.println("April = 28 days ");
        } else if (n == 5) {
            System.out.println("May = 28 days ");
        } else if (n == 6) {
            System.out.println("June = 28 days ");
        } else if (n == 7) {
            System.out.println("July = 28 days ");
        } else if (n == 8) {
            System.out.println("August = 28 days ");
        } else if (n == 9) {
            System.out.println("September = 28 days ");
        } else if (n == 10) {
            System.out.println("October = 28 days ");
        } else if (n == 11) {
            System.out.println("November = 28 days ");
        } else if (n == 12) {
            System.out.println("December = 28 days ");
        }
    }
}
