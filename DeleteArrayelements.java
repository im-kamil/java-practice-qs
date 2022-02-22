import java.util.Scanner;

public class DeleteArrayelements {
    public static void main(String[] args) {
        // delete any array elements
        // input a[3]=40,50,60
        // loc=1
        // output a[3-1]=40,60
        int size, loc, i;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        size = s.nextInt();

        int a[] = new int[size];
        System.out.println("Enter array elements ");
        for (i = 0; i < size; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("Enter Array location ");
        loc = s.nextInt();
        for (i = loc; i < size - 1; i++) {
            a[i] = a[i + 1];
        }
        size--;
        for (i = 0; i < size; i++) {
            System.out.println(a[i] + " ");
        }
    }
}
