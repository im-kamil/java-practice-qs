import java.util.Scanner;

public class BiggestElementsinArray {
    public static void main(String[] args) {
        // find biggest element in Array
        int a[] = new int[5];
        int max;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Array elements ");
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Maximum Element " + max);
    }
}
