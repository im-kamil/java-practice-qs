import java.util.Scanner;

public class kamil {
    public static void main(String[] args) {
        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int c[][] = new int[2][2];
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first matrix ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = s.nextInt();
            }
        }
        System.out.println("Enter second matrix ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                b[i][j] = s.nextInt();
            }
        }
        System.out.println("First matrix ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(a[i][j] + " ");
            }
        }
        System.out.println("Second matrix ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(b[i][j] + " ");
            }
        }
        System.out.println("Sum of matrix ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.println(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
