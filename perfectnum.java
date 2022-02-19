import java.util.Scanner;

public class perfectnum {
    public static void main(String[] args) {
        // perfect number input num 6---->1,2,3,4,5,6
        // 6 ---->1+2+3=6 is perfect number
        int n, sum = 0;
        System.out.print("Enter any number ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (n == sum) {
            System.out.println("Perfect number ");
        } else {
            System.out.println("Not perfect number ");
        }
    }
}
