import java.security.InvalidAlgorithmParameterException;

class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        System.out.println(msg);
    }
}

public class UserDefinedException {
    public static void main(String[] args) {
        int age = 18;
        try {

        } catch (Exception e) {
            System.out.println(e);
        }

        {
            if (age < 18) {
                System.out.println("Not eligible for voring ");
            } else {
                System.out.println("Eligible for voting ");
            }
        }
    }
}
