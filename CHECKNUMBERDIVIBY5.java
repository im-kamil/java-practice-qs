import java.util.Scanner;

public class CHECKNUMBERDIVIBY5 {
    public static void main(String[] args) {
        // check number is divisible by 5 or not
        // INPUT 10 ---> is divisible by 5
        // input 12 ---> not divisible by 5
        int n;
        System.out.print("Enter a number ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        if (n % 5 == 0) {
            System.out.println("Divisile by 5 ");
        } else {
            System.out.println("Not Divisile by 5 ");
        }
    }
}
