import java.util.Scanner;

public class CopyArrayElements {
    public static void main(String[] args) {
        // copy array elements
        // first A[]=10 20 30----> B[]---->10 20 30
        int a[] = new int[5];
        int b[] = new int[5];
        Scanner s = new Scanner(System.in);
        System.out.print("Enter elements of Array ");
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("First Array elements");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
        System.out.println("Second Array Elements ");
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
            System.out.println(b[i] + " ");
        }
    }
}
