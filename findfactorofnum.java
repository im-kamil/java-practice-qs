import java.util.Scanner;

public class findfactorofnum {
    public static void main(String[] args) {
        // find factor of a number
        // input 10 ---->1,2,5,10
        int n;
        System.out.print("Enter a number of factor ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i + " ");
            }
        }
    }
}
