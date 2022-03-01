import java.util.Scanner;

public class fun {
    // how to use method in java
    int n1, n2;
    int add, sub, multi, div, rem;

    // Scanner s = new Scanner(System.in); //any place we can take
    public static void main(String[] args) {
        fun ref = new fun();
        ref.input();
        ref.process();
        ref.output();
    }

    void input() {
        Scanner s = new Scanner(System.in); // but input ek hi lena hai
        System.out.println("Enter two numbers ");
        n1 = s.nextInt();
        n2 = s.nextInt();
    }

    void process() {
        add = n1 + n2;
        sub = n1 - n2;
        multi = n1 * n2;
        div = n1 / n2;
        rem = n1 % n2;
    }

    void output() {
        System.out.println("Sum of two numbers: " + add);
        System.out.println("Subtract of two numbers: " + sub);
        System.out.println("multiply of two numbers: " + multi);
        System.out.println("division of two numbers: " + div);
        System.out.println("Remainder of two numbers: " + rem);
    }
}
