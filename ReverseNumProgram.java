import java.util.Scanner;

public class ReverseNumProgram {
    public static void main(String[] args) {
        // reverse number program in java
        // input num 123---> 321 output
        int n, k;
        System.out.print("Enter any number ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        while (n > 0) {
            k = n % 10;
            System.out.print(k);
            n = n / 10;
        }
    }
}
