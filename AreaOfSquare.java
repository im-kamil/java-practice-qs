import java.util.Scanner;

public class AreaOfSquare {
    public static void main(String[] args) {
        // calculate the area of square
        // SIDE*SIDE
        int r, area; // r= side
        System.out.print("Enter the number of side ");
        Scanner s = new Scanner(System.in);
        r = s.nextInt();
        area = r * r;
        System.out.print("Area of square " + area);
    }
}
