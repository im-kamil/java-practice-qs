import java.util.Scanner;

public class ASCIIvalue {
    public static void main(String[] args) {
        // print ASCII value
        // input A ----> 65
        char ch;
        Scanner s = new Scanner(System.in);
        ch = s.next().charAt(0);
        int a = ch;
        System.out.print("ASCII value of " + ch + " is " + a);
    }
}
