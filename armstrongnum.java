import java.util.Scanner;

public class armstrongnum {
    public static void main(String[] args) {
        // armstrong number
        // input 153------> (1*1*1* + 5*5*5 + 3*3*3 = 153)
        int n, arm = 0, r, c;
        System.out.print("Enter any number ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        c = n;
        while (n > 0) {
            r = n % 10;
            arm = (r * r * r) + arm;
            n = n / 10;
        }
        if (c == arm) {
            System.out.println("Armstrong number ");
        } else {
            System.out.println("Not Armstrong number ");
        }

    }
}
