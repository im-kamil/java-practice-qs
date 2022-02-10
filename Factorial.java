import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // find factorial of number
        // input 5----->120 is factorial of 5 5=5*4*3*2*1=120
        int n, fact = 1;
        System.out.print("Enter any number ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.print("Factorail " + fact);
    }
}
