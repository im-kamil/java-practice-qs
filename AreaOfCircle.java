import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        // calculate area of circle
        // PI*r*r
        final double PI = 3.14, area;
        int r;
        System.out.println("Enter a radius ");
        Scanner s = new Scanner(System.in);
        r = s.nextInt();
        area = PI * r * r;
        System.out.println("Area of circle " + area);
    }
}
