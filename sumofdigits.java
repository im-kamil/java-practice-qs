import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        // sum of digits program
        // input number 350----->3+5+0=8 output
        int n, r, sum = 0;
        System.out.print("Enter any number ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        while (n > 0) {
            r = n % 10;
            sum = sum + r;
            n = n / 10;
        }
        System.out.print("Sum of digits " + sum);
    }
}
