import java.util.Scanner;

public class TribonacciSeries {
    public static void main(String[] args) {
        // tribonacci series
        // 0 1 2 3 6 11 = starting add three numbers = tribonacci series
        int term, a = 0, b = 1, c = 3, d;
        System.out.print("Enter any term ");
        Scanner s = new Scanner(System.in);
        term = s.nextInt();
        for (int i = 1; i <= term; i++) {
            System.out.print(a + " ");
            d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
    }
}
