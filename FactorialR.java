import java.util.Scanner;

public class FactorialR {
    public static void main(String[] args) {
        // factorial using Recursion
        int n;
        System.out.print("Enter any Number ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        FactorialR obj = new FactorialR();
        int result = obj.fact(n);
        System.out.println("Factorial of given number " + result);

    }

    int fact(int n) {
        if (n == 1)
            return 1;
        else
            return n * fact(n - 1);
    }
}
