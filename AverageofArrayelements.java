import java.util.Scanner;

public class AverageofArrayelements {
    public static void main(String[] args) {
        // Average array elements
        // input a[5]--->10 20 30 40 50 =150
        // avg = 150/5
        int a[] = new int[5];
        int sum = 0;
        double avg;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter avg array elements ");
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("Array elemenst ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
        for (int i = 0; i < a.length; i++) {
            sum = a[i] + sum;
        }
        avg = sum / 5.0;
        System.out.println("ADDITION" + sum + "AVERAGE" + avg);
    }
}
