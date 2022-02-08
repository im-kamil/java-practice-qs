import java.util.Scanner;

public class SumofOddEvenRange {
    public static void main(String[] args) {
        // sum of odd or even in given range
        // even 10(0+2+4+6+8+10=30)
        // odd 11(1+3+5+7+9+11=33)
        int n, sum = 0;
        System.out.println("Enter range");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        if (n % 2 == 0) {
            for (int i = 0; i <= n; i=i+2) {
                sum = sum + i;
            }
            System.out.println("Sum of even number " + sum);
        } else {
            for (int i = 1; i <= n; i=i+2) {
                sum = sum + i;
            }
            System.out.println("Sum of odd number " + sum);
        }
    }
}
