import java.util.Scanner;

public class CountNumofDigits {
    public static void main(String[] args) {
        // count number of digits
        // input 12345---->5digits
        int n, count = 0;
        System.out.print("Enter any num ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        while (n > 0) {
            n = n / 10;
            count++;
        }
        System.out.print("No of digits " + count);
    }
}
