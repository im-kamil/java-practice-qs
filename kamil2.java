import java.util.Scanner;

public class kamil2 {
    public static void main(String[] args) {
        int arr[][] = new int[2][2];
        System.out.print("Enter a new Matrix ");
        Scanner s = new Scanner(System.in);
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        System.out.print("Array matrix ");
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("Transpose matrix ");
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                System.out.println(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}
