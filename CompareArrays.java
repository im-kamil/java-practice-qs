import java.util.Arrays;

public class CompareArrays {
    public static void main(String[] args) {
        // compare Arays
        // 1. ==
        // 2. equals() // valid
        int a[] = { 10, 20, 30, 40, 50 };
        int b[] = { 10, 20, 30, 40, 50 };
        // if (a == b) { // == fails because referance variable is not same
        if (Arrays.equals(a, b)) {
            System.out.println("Both are Equals ");
        } else {
            System.out.println("Both are Not Equals ");
        }
    }
}
