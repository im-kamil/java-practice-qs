import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {
        // calculator program in java
        // input n1, n2 select operation thn result
        int n1, n2, ch, cal; // ch=choice
        System.out.print("Enter two numbers ");
        Scanner s = new Scanner(System.in);
        n1 = s.nextInt();
        n2 = s.nextInt();
        System.out.print("Select operation ");
        ch = s.nextInt();
        if (ch == 1) {
            cal = n1 + n2;
            System.out.print("ADDITION " + cal);
        } else if (ch == 2) {
            cal = n1 - n2;
            System.out.print("SUBTRACTION " + cal);
        } else if (ch == 3) {
            cal = n1 * n2;
            System.out.print("MULTIPLICATION " + cal);
        } else if (ch == 4) {
            cal = n1 / n2;
            System.out.print("DIVISION " + cal);
        } else {
            cal = n1 % n2; // MODULUS OPERATOR
            System.out.print("REMAINDER " + cal);
        }
    }
}
