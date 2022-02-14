import java.util.Scanner;

public class checknumpositiveornegative {
    public static void main(String[] args) {
        // check num positive or negative
        // input num<0----> negative
        // input num>0---->positive
        int num;
        System.out.print("Enter a number ");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        if (num > 0) {
            System.out.println("Number is positive ");
        } else {
            System.out.println("Number is Negative ");
        }
    }
}
