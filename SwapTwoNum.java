import java.util.Scanner;

public class SwapTwoNum {
    public static void main(String[] args) {
        // swap two numbers
        // kamil=10---> fazal=20
        // kamil=20----> <---zoya is temporary variable which gives money temp is
        // temporary---> fazal=10 , this is swap
        int a, b, temp;
        System.out.print("Enter two numbers ");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        System.out.println("Before swapping " + a + " " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping " + a + " " + b);
    }
}
