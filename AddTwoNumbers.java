import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        int a, b, sum;
        System.out.println("Enter two numbers");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        sum = a + b;
        System.out.println("ADDITION " + sum);
    }
}
