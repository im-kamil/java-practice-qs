import java.util.Scanner;

public class SortArrayinAscendingOrder {
    public static void main(String[] args) {
        // sort array elements in ascending order
        // lets a[5] ---->14,13,12,10,15 = 10,12,13,14,15
        int a[] = new int[5];
        int temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Array elemsnts ");
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
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
