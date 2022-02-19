import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        // prime number
        // input number 7 --->7 is a prime number
        int n, count = 0;
        System.out.print("Enter any number ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Prime number ");
        } else {
            System.out.println("Not Prime number ");
        }
    }
}
