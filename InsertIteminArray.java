import java.util.Scanner;

public class InsertIteminArray {
    public static void main(String[] args) {
        // insert item in Array
        // input a[3] = 10 20 30
        // loc=1 item=100
        // now a[3+1] = 10 100 20 30
        int a[] = new int[5];
        int size = 0, item, loc, i;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array elements ");
        for (i = 0; i < size; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("Enter Array Location ");
        loc = s.nextInt();
        System.out.println("Enter new Item ");
        item = s.nextInt();
        for (i = size; i > loc; i--) {
            a[i] = a[i - 1];
        }
        a[loc] = item;
        size++;
        for (i = 0; i < size; i++) {
            System.out.println();
        }
    }
}
