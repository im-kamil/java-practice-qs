import java.util.Scanner;

public class OddEvenProgram {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        if (n % 2 == 0) {
            System.out.println("Number is even ");
        } else {
            System.out.println("Number is odd");
        }
    }
}
