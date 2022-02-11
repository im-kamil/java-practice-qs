import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // print multiplication table
        // input number = 6
        // 6*1=6------6*10=60
        int num;
        System.out.print("Enter your number ");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "*" + "i" + "=" + num * i);
        }
    }
}
