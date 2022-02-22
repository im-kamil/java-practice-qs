import java.util.Scanner;

public class SmallestelementinArray {
    public static void main(String[] args) {
        // find Smallest element in Array
        int a[] = new int[5];
        int min;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Array elements ");
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Minimum element " + min);
    }
}
