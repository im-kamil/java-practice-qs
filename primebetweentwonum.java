import java.util.Scanner;

public class primebetweentwonum {
    private static int j;

    public static void main(String[] args) {
        // prime number between two num
        // input first number --->20
        // input second number --->10
        // prime number 11,13,17,19
        int n1, n2;
        System.out.print("Enter two numbers ");
        Scanner s = new Scanner(System.in);
        n1 = s.nextInt();
        n2 = s.nextInt();
        for (int i = n1; i <= n2; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (i == j) {
                System.out.println(j+ " ");
            }
        }
    }
}
