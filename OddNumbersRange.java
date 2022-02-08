import java.util.Scanner;

public class OddNumbersRange {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter a number");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for (int i = 1; i <= n; i = i + 2) {
            System.out.println(i + " ");
        }
    }
}
