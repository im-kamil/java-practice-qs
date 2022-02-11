import java.util.Scanner;

public class VoteEligibility {
    public static void main(String[] args) {
        // eligible for vote or not
        // input age>=18--->vote
        // input age<18----->not vote
        int age;
        System.out.print("Enter your age ");
        Scanner s = new Scanner(System.in);
        age = s.nextInt();
        if (age >= 18) {
            System.out.print("Eligible for votes ");
        } else {
            System.out.print("Not Eligible for votes ");
        }
    }
}
