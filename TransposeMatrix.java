import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        // Transpose matrix
        // convert row data into column
        int a[][] = new int[2][2];
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Array DATA ");
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                a[i][j] = s.nextInt();
            }
        }
        System.out.print("Array Matrix \n ");
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("Transpose Matrix \n ");
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }
}
