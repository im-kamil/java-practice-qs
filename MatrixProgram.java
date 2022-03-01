import java.util.Scanner;

public class MatrixProgram {
    public static void main(String[] args) {
        // Matrix program in 2 D array
        // for matrix program 2D array is must
        int a[][] = new int[2][2];
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Array elements ");
        for (int i = 0; i < 2; i++) { // rows
            for (int j = 0; j < 2; j++) { // columns
                a[i][j] = s.nextInt();
            }
        }
        System.out.print("Matrix : \n ");
        for (int i = 0; i < 2; i++) { // rows
            for (int j = 0; j < 2; j++) { // columns
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
