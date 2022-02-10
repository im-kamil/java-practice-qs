import java.util.Scanner;

public class AverageMarksof5Stud {
    public static void main(String[] args) {
        // calculate average marks of 5 students
        // input 10,20,30,40,50 -----> average
        int a, b, c, d, e;
        System.out.print("Enter marks of 5 students ");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        d = s.nextInt();
        e = s.nextInt();
        int sum = a + b + c + d + e;
        System.out.print("Sum of marks " + sum);
        double avg = sum / 5.0;
        System.out.println("Average of marks " + avg);
    }
}
