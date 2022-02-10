import java.util.Scanner;

public class VowelsorConsonant {
    public static void main(String[] args) {
        char ch;
        System.out.print("Enter any character ");
        Scanner s = new Scanner(System.in);
        ch = s.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Vowels ");
        } else {
            System.out.println("Consonant ");
        }
    }
}
