import java.util.Scanner;

public class SortArrayinDescendingorder {
    public static void main(String[] args) {
        // sort array elements in descending order
        // input lets a[5] ---->14,13,12,10,15 = 15,14,13,12,10
        int a[] = new int[5];
        int temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter array elements ");
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }
}
