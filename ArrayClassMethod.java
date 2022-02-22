import java.util.Arrays;
import java.util.Scanner;

public class ArrayClassMethod {
    public static void main(String[] args) {
        // sort() equals() copyOf()
        /*
         * int a[] = new int[5];
         * System.out.print("Enter data in Array ");
         * Scanner s = new Scanner(System.in);
         * for (int i = 0; i < a.length; i++) {
         * a[i] = s.nextInt();
         * }
         * Arrays.sort(a);
         * for (int i = 0; i < a.length; i++) {
         * System.out.println(a[i] + " ");
         * }
         */
        // equals()
        /*
         * int a[] = new int[5];
         * int b[] = new int[5];
         * System.out.print("Enter data in Array 1 ");
         * Scanner s = new Scanner(System.in);
         * for (int i = 0; i < a.length; i++) {
         * a[i] = s.nextInt();
         * }
         * System.out.print("Enter data in Array 2 ");
         * for (int i = 0; i < b.length; i++) {
         * b[i] = s.nextInt();
         * }
         * Arrays.equals(a, b);
         * System.out.print("Kya dono equals hai " + b);
         */
        // copyOf()
        int a[] = new int[5];
        System.out.print("Enter data in Array ");
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }

        int a2[] = Arrays.copyOf(a, 5);
        System.out.print("Data in Array 2 ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a2[i] + " ");
        }

    }
}
