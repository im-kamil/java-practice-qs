import java.util.Arrays;
import java.util.Scanner;

public class ArrayClassMethod {
    public static void main(String[] args) {
        // sort() equals() copyOf()
        int a[] = new int[5];
        System.out.print("Enter data in Array ");
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }
}
