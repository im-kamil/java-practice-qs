import java.util.Scanner;

public class palindromenumprogram {
    public static void main(String[] args) {
        // palindrome number program
        // input number 121 ---> 121 output
        int n, r, s = 0, c;
        System.out.print("Enter palindrome number ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        c = n;
        while (n > 0) {
            r = n % 10;
            s = (s * 10) + r; // s=0 because we r adding and 1 because we r multiplying
            n = n / 10;
        }
        if (c == s) {
            System.out.println("Palindrome number ");
        } else {
            System.out.println(" Not Palindrome number ");

        }
    }
}
