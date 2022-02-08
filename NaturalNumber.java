import java.util.Scanner;

public class NaturalNumber {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number of term");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " ");
        }
    }
}
