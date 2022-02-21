import java.util.Scanner;

public class SumofArray {
    public static void main(String[] args) {
        // sum of array elements
        int a[] = new int[5];
        int sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter sum of Array elements ");
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        System.out.print("Array elements ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            sum = a[i] + sum;
        }
        System.out.println("ADDITION " + sum);
    }
}
