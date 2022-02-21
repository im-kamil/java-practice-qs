import java.util.Scanner;

public class ArrayElementsinReverse {
    public static void main(String[] args) {
        // print Array elements in reverse order
        // input a[5]---->10,20,30,40,50 --->50,40,30,20,10
        int a[] = new int[5];
        Scanner s = new Scanner(System.in);
        System.out.print("Enter array elements ");
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("Array element ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
        System.out.println("Array Reverse elements ");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i] + " ");
        }
    }
}
