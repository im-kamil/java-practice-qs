import java.util.Scanner;

public class PowerOfNum {
    public static void main(String[] args) {
        // calculate power of number
        // input n=5
        // power p=2
        // 5*5=25
        int n, p, result = 1;
        System.out.print("Enter any no ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        System.out.print("Enter power ");
        p = s.nextInt();
        for (int i = 1; i <= p; i++) {
            result = n * result; // when variable is used for multiplication thn we should multiply with 1
        }
        System.out.print("Power " + result);
    }
}
