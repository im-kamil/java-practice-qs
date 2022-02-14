import java.util.Scanner;

public class ConvertUpperCharToLower {
    public static void main(String[] args) {
        // convert character lower to uper
        // input a to z ---> upper case
        // input A TO Z ---> lower case
        char ch, ch2;
        System.out.print("Enter any character ");
        Scanner s = new Scanner(System.in);
        ch = s.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            ch2 = Character.toLowerCase(ch);
            System.out.println("Lower Case " + ch2);
        } else {
            ch2 = Character.toUpperCase(ch);
            System.out.println("Upper Case " + ch2);
        }
    }
}
