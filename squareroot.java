import java.util.Scanner;

public class squareroot {
    public static void main(String[] args) {
        // square root input 25 ---> 5
        int n;
        System.out.print("Enter any number ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        double m = Math.sqrt(n);
        System.out.println("Square root of " + n + " is " + m);
    }
}