import java.util.Scanner;

public class MirrorMatrix {
    public static void main(String[] args) {
        // Mirror matrix
        int a[][] = new int[2][2];
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Array matrix Data ");
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                a[i][j] = s.nextInt();
            }
        }
        System.out.print("Array matrix \n ");
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("Mirror matrix \n ");
        for (int i = 0; i <= 1; i++) {
            for (int j = 1; j >= 0; j--) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
