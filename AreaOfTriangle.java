import java.util.Scanner;
import java.lang.Math;
public class AreaOfTriangle {
    public static void main(String[] args) {
        // calculate the area of triangle
        // area of triangle = 1/2*b*h
        // input a,b,c
        // find semiperimeter 
        // area of triangle
        int a,b,c, sp, area;
        System.out.println("Enter value for sides of triangle ");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        sp = (a+b+c)/2;
       area = Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
       System.out.print("Area of triangle " + area);
    }
}
