import java.util.Scanner;

public class SwapWithoutThirdVariable {
    public static void main(String[] args) {
        // swap two numbers without using third variable
        // a=10, b=20
        int a, b;
        System.out.print("Enter two numbers ");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        System.out.println("Before swapping " + a + " " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping " + a + " " + b);
    }
}
