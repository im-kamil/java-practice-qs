import java.util.Scanner;

public class SearchArrayelements {
    public static void main(String[] args) {
        // searching Array elements
        // input a[5] = 10 20 30 40 50
        // output 30----> found
        // output 70 ----> not found
        int a[] = new int[5];
        int n, count = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter elements in Array ");
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("Array elements ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\n Enter search elements ");
        n = s.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Item found ");
        } else {
            System.out.println("Item not found ");
        }
    }
}
